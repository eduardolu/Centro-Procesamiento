package es.upm.dit.isst.process.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Alerta implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipo;
	private String subtipo;
	
	public Alerta(String tipo, String subtipo){
		this.setTipo(tipo);
		this.setSubtipo(subtipo);
	}

	public Long getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSubtipo() {
		return subtipo;
	}

	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
	}


}
