	SET ECHO OFF
	SET VERIFY OFF
	ACCEPT COD_M -
	PROMPT 'Por favor inserta el c�digo del m�dico '
	ACCEPT N_M -
	PROMPT 'Por favor inserta el nombre del m�dico: '
	ACCEPT COD_H -
	PROMPT 'Por favor inserta el c�digo del hospital: '
	INSERT INTO MEDICO
	VALUES (&COD_M, '&N_M', &COD_H)
	/
	SET VERIFY ON
	SET ECHO ON;