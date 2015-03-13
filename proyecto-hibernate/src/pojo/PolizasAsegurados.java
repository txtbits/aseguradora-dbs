package pojo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "POLIZAS_ASEGURADOS", schema = "PROYECTO")
public class PolizasAsegurados implements java.io.Serializable {

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codP", column = @Column(name = "COD_P", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "datosP", column = @Column(name = "DATOS_P", nullable = false, length = 50)),
			@AttributeOverride(name = "num", column = @Column(name = "NUM", nullable = false, precision = 1, scale = 0)),
			@AttributeOverride(name = "na", column = @Column(name = "NA", length = 35)),
			@AttributeOverride(name = "fn", column = @Column(name = "FN", length = 7)) })
	private PolizasAseguradosId id;

	public PolizasAsegurados() {
	}

	public PolizasAsegurados(PolizasAseguradosId id) {
		this.id = id;
	}

	public PolizasAseguradosId getId() {
		return this.id;
	}

	public void setId(PolizasAseguradosId id) {
		this.id = id;
	}

}
