-- Creamos el objeto de ASEGURADO_OBJ
create or replace TYPE ASEGURADO_OBJ AS OBJECT
(COD_P INTEGER,
 NUM INTEGER,
 NA VARCHAR2(35),
 FN DATE);

--Creo tipo para la nested table.
CREATE OR REPLACE TYPE ASEGURADO_OBJ_NESTED AS TABLE OF ASEGURADO_OBJ;

-- Creamos el objeto de POLIZA_OBJ
create or replace TYPE POLIZA_OBJ AS OBJECT
( COD_P INTEGER,
  DATOS_P VARCHAR2(50),
  ASEGURADO ASEGURADO_OBJ_NESTED);

 -- Creamos la tabla POLIZA_TABLE_OBJ a partir del objeto POLIZA_OBJ
CREATE TABLE POLIZA_TABLE_OBJ OF POLIZA_OBJ
(COD_P PRIMARY KEY)
NESTED TABLE ASEGURADO STORE AS TABLA_ASEGURADOS;

-- Inserciones en POLIZA_TABLE_OBJ
INSERT INTO poliza_table_obj 
VALUES (POLIZA_OBJ(1,'datos poliza 1', ASEGURADO_OBJ_NESTED(
  ASEGURADO_OBJ(1, 1, 'Forcada', TO_DATE('14/12/88', 'DD/MM/YY')),
  ASEGURADO_OBJ(1, 2, 'Merin', TO_DATE('27/02/92', 'DD/MM/YY'))
)));

INSERT INTO poliza_table_obj 
VALUES (POLIZA_OBJ(2,'datos poliza 2', ASEGURADO_OBJ_NESTED(
  ASEGURADO_OBJ(2, 1, 'Rodriguez', sysdate))
));

-- consultas
select p.cod_p as "Codigo Poliza", p.datos_p as "Datos Poliza", CURSOR(SELECT pa.na FROM TABLE(p.asegurado) pa) as Nombre from poliza_table_obj p;

select p.cod_p as "Polizas", CURSOR(
  SELECT pa.na FROM TABLE(p.asegurado) pa) from poliza_table_obj p
  where p.cod_p = 1;

select CURSOR(SELECT TT.na,TT.fn FROM TABLE(T.asegurado) TT) FROM poliza_table_obj T
where T.cod_p = 2;

CREATE OR REPLACE PROCEDURE CONSULTAR
DECLARE
  CURSOR C1 IS SELECT * FROM poliza_table_obj;
BEGIN
  FOR I IN C1 LOOP 
    DBMS_OUTPUT.PUT_LINE('Nombre: ' || I.COD_P || ' - Nombre: ' || I.ASEGURADO.NA || ' - Fecha: ' || I.ASEGURADO.FN);
  END LOOP;
END;
/