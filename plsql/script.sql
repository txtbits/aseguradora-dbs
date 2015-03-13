-- Creamos el objeto de DIRECCION_OBJ
CREATE OR REPLACE TYPE DIRECCION_OBJ AS OBJECT
(CALLE VARCHAR2(100),
  CPOSTAL NUMBER(5),
  CIUDAD VARCHAR2(20) );
 
--Creo tipo para la nested table.
CREATE OR REPLACE TYPE DIRECCION_OBJ_NESTED AS TABLE OF DIRECCION_OBJ;
CREATE OR REPLACE TYPE ASEGURADO_OBJ_NESTED AS TABLE OF ASEGURADO_OBJ;

-- Creamos el objeto de POLIZA_OBJ
create or replace TYPE POLIZA_OBJ AS OBJECT
( COD_P INTEGER,
  DATOS_P VARCHAR2(50),
  ASEGURADO ASEGURADO_OBJ_NESTED);

-- Creamos el objeto de ASEGURADO_OBJ
create or replace TYPE ASEGURADO_OBJ AS OBJECT
(COD_P INTEGER,
 NUM INTEGER,
 NA VARCHAR2(35),
 DIR DIRECCION_OBJ_NESTED,
 FN DATE);

 -- Creamos la tabla POLIZA_TABLE_OBJ a partir del objeto POLIZA_OBJ
 CREATE TABLE POLIZA_TABLE_OBJ OF POLIZA_OBJ
(COD_P PRIMARY KEY)
NESTED TABLE ASEGURADO STORE AS TABLA_ASEGURADOS;

-- Creamos la tabla ASEGURADO_TABLE_OBJ a partir del objeto ASEGURADO_OBJ
CREATE TABLE ASEGURADO_TABLE_OBJ OF ASEGURADO_OBJ
(PRIMARY KEY(COD_P, NUM))
NESTED TABLE DIR STORE AS TABLA_DIRS;

-- Inserciones en POLIZA_TABLE_OBJ
INSERT INTO poliza_table_obj 
VALUES (POLIZA_OBJ(1,'datos poliza 1'));

INSERT INTO poliza_table_obj 
VALUES (POLIZA_OBJ(2,'datos poliza 2'));

-- Inserciones en ASEGURADO_TABLE_OBJ
INSERT INTO asegurado_table_obj
VALUES (ASEGURADO_OBJ(1, 1, 'Forcada', DIRECCION_OBJ_NESTED(DIRECCION_OBJ('calle forcada', 50019, 'Zaragoza')), TO_DATE('14/12/88', 'DD/MM/YY')));

INSERT INTO asegurado_table_obj
VALUES (ASEGURADO_OBJ(1, 2, 'Merin', DIRECCION_OBJ_NESTED(DIRECCION_OBJ('calle merin', 50600, 'Ejea')), TO_DATE('27/02/92', 'DD/MM/YY')));

INSERT INTO asegurado_table_obj
VALUES (ASEGURADO_OBJ(2, 1, 'Rodriguez', DIRECCION_OBJ_NESTED(DIRECCION_OBJ('calle fuentes', 28080, 'Madrid')), sysdate));

-- Consultas
select a.cod_p as "Codigo Poliza", a.num as "Numero Asegurado", a.na as Nombre from asegurado_table_obj a
where (SELECT d.cpostal FROM TABLE(a.DIR) d) = 50600
and a.fn < TO_DATE('01/01/1990','dd/mm/yyyy');

select T.na, CURSOR(SELECT TT.Calle FROM TABLE(T.DIR) TT) FROM asegurado_table_obj T
where T.na = 'Forcada';

CREATE OR REPLACE PROCEDURE CONSULTAR_1
DECLARE
  CURSOR C1 IS SELECT * FROM asegurado_table_obj;
BEGIN 
  FOR I IN C1 LOOP 
    DBMS_OUTPUT.PUT_LINE('Nombre: ' || I.NA || ' - Dirección: ' || I.DIR.CALLE || ' - Cod. Postal: ' || I.DIR.CPOSTAL);
  END LOOP;
END;
/