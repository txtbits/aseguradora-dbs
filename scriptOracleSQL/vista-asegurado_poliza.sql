CREATE OR REPLACE VIEW POLIZAS_ASEGURADOS (
  cod_p,
  datos_p,
  num,
  na,
  fn )
AS SELECT
  p.cod_p,
  p.datos_p,
  ase.num,
  ase.na,
  ase.fn
FROM 
  poliza p,
  asegurado ase
WHERE
  p.cod_p = ase.cod_p;