package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOSPITAL", schema = "PROYECTO")
public class Hospital implements java.io.Serializable {

	@Id
	@Column(name = "COD_H", unique = true, nullable = false, precision = 3, scale = 0)
	private short codH;

	@Column(name = "N_H", length = 30)
	private String NH;

	@Column(name = "NUM_C", precision = 4, scale = 0)
	private Short numC;

	public Hospital() {
	}

	public Hospital(short codH) {
		this.codH = codH;
	}

	public Hospital(short codH, String NH, Short numC) {
		this.codH = codH;
		this.NH = NH;
		this.numC = numC;
	}

	public short getCodH() {
		return this.codH;
	}

	public void setCodH(short codH) {
		this.codH = codH;
	}

	public String getNH() {
		return this.NH;
	}

	public void setNH(String NH) {
		this.NH = NH;
	}

	public Short getNumC() {
		return this.numC;
	}

	public void setNumC(Short numC) {
		this.numC = numC;
	}

}
