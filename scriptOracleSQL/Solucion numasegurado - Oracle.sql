
/*
	Soluci�n para insertar los asegurados seg�n la poliza.

*/
	
	INSERT INTO ASEGURADO VALUES (000001,  (SELECT TO_NUMBER(NVL(TO_CHAR(MAX(NUM)+1), '1')) FROM ASEGURADO WHERE COD_P = 1), 'Pepa Gonz�lez', SYSDATE);

