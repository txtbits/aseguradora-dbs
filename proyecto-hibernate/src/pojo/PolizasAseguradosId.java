package pojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PolizasAseguradosId implements java.io.Serializable {

	@Column(name = "COD_P", nullable = false, precision = 5, scale = 0)
	private int codP;
	
	@Column(name = "DATOS_P", nullable = false, length = 50)
	private String datosP;
	
	@Column(name = "NUM", nullable = false, precision = 1, scale = 0)
	private int num;
	
	@Column(name = "NA", length = 35)
	private String na;
	
	@Column(name = "FN", length = 7)
	private Date fn;

	public PolizasAseguradosId() {
	}

	public PolizasAseguradosId(int codP, String datosP, int num) {
		this.codP = codP;
		this.datosP = datosP;
		this.num = num;
	}

	public PolizasAseguradosId(int codP, String datosP, int num, String na,
			Date fn) {
		this.codP = codP;
		this.datosP = datosP;
		this.num = num;
		this.na = na;
		this.fn = fn;
	}
	
	public int getCodP() {
		return this.codP;
	}

	public void setCodP(int codP) {
		this.codP = codP;
	}

	public String getDatosP() {
		return this.datosP;
	}

	public void setDatosP(String datosP) {
		this.datosP = datosP;
	}
	
	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String getNa() {
		return this.na;
	}

	public void setNa(String na) {
		this.na = na;
	}

	public Date getFn() {
		return this.fn;
	}

	public void setFn(Date fn) {
		this.fn = fn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PolizasAseguradosId))
			return false;
		PolizasAseguradosId castOther = (PolizasAseguradosId) other;

		return (this.getCodP() == castOther.getCodP())
				&& ((this.getDatosP() == castOther.getDatosP()) || (this
						.getDatosP() != null && castOther.getDatosP() != null && this
						.getDatosP().equals(castOther.getDatosP())))
				&& (this.getNum() == castOther.getNum())
				&& ((this.getNa() == castOther.getNa()) || (this.getNa() != null
						&& castOther.getNa() != null && this.getNa().equals(
						castOther.getNa())))
				&& ((this.getFn() == castOther.getFn()) || (this.getFn() != null
						&& castOther.getFn() != null && this.getFn().equals(
						castOther.getFn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodP();
		result = 37 * result
				+ (getDatosP() == null ? 0 : this.getDatosP().hashCode());
		result = 37 * result + this.getNum();
		result = 37 * result + (getNa() == null ? 0 : this.getNa().hashCode());
		result = 37 * result + (getFn() == null ? 0 : this.getFn().hashCode());
		return result;
	}

}
