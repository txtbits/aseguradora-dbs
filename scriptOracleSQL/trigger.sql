create or replace TRIGGER "TR_POLIZAS_ASEGURADO"
  INSTEAD OF INSERT OR DELETE OR UPDATE ON POLIZAS_ASEGURADOS
    BEGIN
      if inserting then
        insert into asegurado (
          cod_p,
          num,
          na,
          fn)
          values (
            :new.cod_p,
            :new.num,
            :new.na,
            :new.fn);
        elsif deleting then
          delete from asegurado
            where :old.cod_p=cod_p
            and :old.num=num;
        else
          update asegurado
            set na = :new.na
              where :old.cod_p=cod_p
              and :old.num=num;
          update asegurado
            set fn = :new.fn
              where :old.cod_p=cod_p
              and :old.num=num;
      end if;
    end;