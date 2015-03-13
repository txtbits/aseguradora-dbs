package pojo;

// Generated 17-feb-2014 19:09:14 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Asegurado generated by hbm2java
 */
@Entity
@Table(name = "ASEGURADO", schema = "PROYECTO")
public class Asegurado implements java.io.Serializable {

	private AseguradoId id;
	private Poliza poliza;
	private String na;
	private Date fn;
	private Set hospitalizados = new HashSet(0);

	public Asegurado() {
	}

	public Asegurado(AseguradoId id, Poliza poliza) {
		this.id = id;
		this.poliza = poliza;
	}

	public Asegurado(AseguradoId id, Poliza poliza, String na, Date fn,
			Set hospitalizados) {
		this.id = id;
		this.poliza = poliza;
		this.na = na;
		this.fn = fn;
		this.hospitalizados = hospitalizados;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codP", column = @Column(name = "COD_P", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "num", column = @Column(name = "NUM", nullable = false, precision = 1, scale = 0)) })
	public AseguradoId getId() {
		return this.id;
	}

	public void setId(AseguradoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_P", nullable = false, insertable = false, updatable = false)
	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

	@Column(name = "NA", length = 35)
	public String getNa() {
		return this.na;
	}

	public void setNa(String na) {
		this.na = na;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FN", length = 7)
	public Date getFn() {
		return this.fn;
	}

	public void setFn(Date fn) {
		this.fn = fn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "asegurado")
	public Set getHospitalizados() {
		return this.hospitalizados;
	}

	public void setHospitalizados(Set hospitalizados) {
		this.hospitalizados = hospitalizados;
	}

}
