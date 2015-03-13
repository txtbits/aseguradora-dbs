/* 
	=====================================
	Script del proyecto BD
	Versi�n Oracle
	Christian Forcada y Ra�l Gracia
	=====================================
*/	


--
-- TABLA HOSPITAL
--

CREATE TABLE HOSPITAL (
	COD_H NUMBER(3),
	N_H VARCHAR2(30),
	NUM_C NUMBER(4),
	CONSTRAINT HOSPITAL_PK PRIMARY KEY (COD_H));
  
INSERT INTO HOSPITAL VALUES (001,'Miguel Servet','60');
INSERT INTO HOSPITAL VALUES (002,'Montpellier','130');
INSERT INTO HOSPITAL VALUES (003,'Royo Villanova','210');
INSERT INTO HOSPITAL VALUES (004,'Quiron','85');
INSERT INTO HOSPITAL VALUES (005,'Lozano Blesa','76');

COMMIT;


--
-- TABLA MEDICO
--

CREATE TABLE MEDICO (
	COD_M NUMBER(3),
	N_M VARCHAR2(30),
	COD_H NUMBER(3) NOT NULL,
	CONSTRAINT MEDICO_PK PRIMARY KEY (COD_M),
	CONSTRAINT M_HOSPITAL_FK FOREIGN KEY (COD_H)
				REFERENCES HOSPITAL(COD_H));
			
INSERT INTO MEDICO VALUES (100,'Pedro Broto Polo',001);
INSERT INTO MEDICO VALUES (101,'Pablo Marin Villarroya',001);
INSERT INTO MEDICO VALUES (200,'Maria Jose Morollon Loriz',002);
INSERT INTO MEDICO VALUES (300,'Jose Resa Bienzobas',003);
INSERT INTO MEDICO VALUES (301,'Francisco Artero Pujol',003);
INSERT INTO MEDICO VALUES (400,'Vicente Comet Lozano',004);
INSERT INTO MEDICO VALUES (500,'Antonio Gasos Lavinia',005);

COMMIT;


---
--- TABLA TELEFONOS MEDICO
---

CREATE TABLE TELF_MEDICO (
	COD_M NUMBER(3),
	TELEFONO NUMBER(9),
	CONSTRAINT TELF_MEDICO_PK PRIMARY KEY (COD_M, TELEFONO),
	CONSTRAINT T_MEDICO_FK FOREIGN KEY (COD_M)
				REFERENCES MEDICO(COD_M));
				
INSERT INTO TELF_MEDICO VALUES (100,666462785);
INSERT INTO TELF_MEDICO VALUES (100,666468527);
INSERT INTO TELF_MEDICO VALUES (101,612345678);
INSERT INTO TELF_MEDICO VALUES (200,678912345);
INSERT INTO TELF_MEDICO VALUES (300,693558245);
INSERT INTO TELF_MEDICO VALUES (301,684659322);
INSERT INTO TELF_MEDICO VALUES (400,665234745);
INSERT INTO TELF_MEDICO VALUES (400,634986290);
INSERT INTO TELF_MEDICO VALUES (500,679375964);

COMMIT;


---
--- TABLA POLIZA
---

CREATE TABLE POLIZA (
	COD_P NUMBER(5),
	DATOS_P VARCHAR(50) NOT NULL,
	CONSTRAINT POLIZA_PK PRIMARY KEY (COD_P));
	
INSERT INTO POLIZA VALUES (00001,'Poliza Familia Fuentes');
INSERT INTO POLIZA VALUES (00002,'Poliza Familia Yeager');
INSERT INTO POLIZA VALUES (00003,'Poliza de prueba vacia');
INSERT INTO POLIZA VALUES (00004,'Poliza de prueba vacia 2');

COMMIT;


---
--- TABLA ASEGURADOS
---

CREATE TABLE ASEGURADO (
	COD_P NUMBER(5),
	NUM NUMBER(1),
	NA VARCHAR2(35),
	FN DATE,
	CONSTRAINT ASEGURADO_PK PRIMARY KEY (COD_P, NUM),
	CONSTRAINT A_POLIZA_FK FOREIGN KEY (COD_P)
				REFERENCES POLIZA(COD_P));
				
INSERT INTO ASEGURADO VALUES (00001,1,'Pepe Fuentes',TO_DATE('24/05/2012', 'DD/MM/YYYY'));
INSERT INTO ASEGURADO VALUES (00001,2,'Pepe Fuentes (hijo)',TO_DATE('24/05/2012', 'DD/MM/YYYY'));
INSERT INTO ASEGURADO VALUES (00002,1,'Caroline Yeager',sysdate);

COMMIT;


---
--- TABLA HOSPITALIZADOS
---

CREATE TABLE HOSPITALIZADO (
	COD_P NUMBER(5),
	NUM NUMBER(1),
	COD_H NUMBER(3),
	FI DATE,
	COD_M NUMBER(3) NOT NULL,
	FF DATE,
	CONSTRAINT HOSPITALIZADO_PK PRIMARY KEY (COD_P, NUM, COD_H, FI),
	CONSTRAINT H_ASEGURADO_FK FOREIGN KEY (COD_P, NUM)
				REFERENCES ASEGURADO(COD_P, NUM),
	CONSTRAINT H_HOSPITAL_FK FOREIGN KEY (COD_H)
				REFERENCES HOSPITAL(COD_H),
	CONSTRAINT H_MEDICO_FK FOREIGN KEY (COD_M)
				REFERENCES MEDICO(COD_M));

INSERT INTO HOSPITALIZADO VALUES (00001,1, 001, sysdate, 100, NULL);
INSERT INTO HOSPITALIZADO VALUES (00001,2, 001, sysdate, 100, NULL);
INSERT INTO HOSPITALIZADO VALUES (00002,1, 004, sysdate, 301, NULL);


--
--	VISTA MEDICOS - TELEFONO
--

CREATE OR REPLACE VIEW telfmedico
AS SELECT m.cod_m, m.n_m, tm.telefono
FROM medico m, telf_medico tm
WHERE m.cod_m = tm.cod_m;

COMMIT;