/**
 * @author Christian
 * @description: Clase que define los hospitales
 */
public class Hospital {
    private String CodHospital;
    private String nombreHospital;
    private String numeroCamas;

    public Hospital(String CodHospital){
        this.CodHospital = CodHospital;
    }
    
    public Hospital(String CodHospital, String nombreHospital, String numeroCamas) {
        this.CodHospital = CodHospital;
        this.nombreHospital = nombreHospital;
        this.numeroCamas = numeroCamas;
    }

    public String getCodHospital() {
        return CodHospital;
    }

    public void setCodHospital(String CodHospital) {
        this.CodHospital = CodHospital;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(String numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
    
}
