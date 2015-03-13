insert into polizas_asegurados values(1,'Poliza Familia Fuentes',3,'Pepe Fuentes (nieto)',TO_DATE('27/02/1992','DD/MM/YY'));
update polizas_asegurados set na='Pepe Fuentes (bisnieto)' where cod_p = 1 and num = 3; 
delete from polizas_asegurados where cod_p = 1 and num = 3;