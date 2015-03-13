package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MEDICO", schema = "PROYECTO")
public class Medico implements java.io.Serializable {


	@Id
	@Column(name = "COD_M", unique = true, nullable = false, precision = 3, scale = 0)
	private short codM;
	
	@Column(name = "N_M", length = 30)
	private String NM;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_H", nullable = false)
	private Hospital hospital;
	

	public Medico() {
	}

	public Medico(short codM, Hospital hospital) {
		this.codM = codM;
		this.hospital = hospital;
	}


	public Medico(short codM, String NM, Hospital hospital) {
		super();
		this.codM = codM;
		this.NM = NM;
		this.hospital = hospital;
	}

	public short getCodM() {
		return this.codM;
	}

	public void setCodM(short codM) {
		this.codM = codM;
	}
	
	public String getNM() {
		return this.NM;
	}

	public void setNM(String NM) {
		this.NM = NM;
	}

	public Hospital getHospital() {
		return this.hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
}
