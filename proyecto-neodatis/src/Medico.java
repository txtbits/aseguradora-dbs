import java.util.List;

/**
 * @author Christian
 * @description: Clase que define los médicos
 */
public class Medico {
    
    private String codMedico;
    private String nombreMedico;
    private Hospital hospital;

    public Medico(String codMedico, String nombreMedico, Hospital hospital) {
        this.codMedico = codMedico;
        this.nombreMedico = nombreMedico;
        this.hospital = hospital;
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
   
}
