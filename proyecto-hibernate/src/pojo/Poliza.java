package pojo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "POLIZA", schema = "PROYECTO")
public class Poliza implements java.io.Serializable {

	@Id
	@Column(name = "COD_P", unique = true, nullable = false, precision = 5, scale = 0)
	private int codP;
	
	@Column(name = "DATOS_P", nullable = false, length = 50)
	private String datosP;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "poliza")
	private Set asegurados = new HashSet(0);

	public Poliza() {
	}

	public Poliza(int codP, String datosP) {
		this.codP = codP;
		this.datosP = datosP;
	}

	public Poliza(int codP, String datosP, Set asegurados) {
		this.codP = codP;
		this.datosP = datosP;
		this.asegurados = asegurados;
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

	public Set getAsegurados() {
		return this.asegurados;
	}

	public void setAsegurados(Set asegurados) {
		this.asegurados = asegurados;
	}

}
