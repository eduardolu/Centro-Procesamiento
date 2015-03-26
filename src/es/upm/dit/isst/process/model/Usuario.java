package es.upm.dit.isst.process.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Datos Principales
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	
	//Datos Personales
	private String sexo;
	private String fecha;
	private String DNI;
	private String telefono;
	private String via;
	private String numeroEdificio;
	private String provincia;
	private String ciudad;
	private String CP;
	private String estadoCivil;
	private String personaContacto1;
	private String telefonoContacto1;
	private String personaContacto2;
	private String telefonoContacto2;
	
	//Datos Sanitarios
	private String numSegSocial;
	private String grupoSanguineo;
	private String operaciones;
	private String enfermPasadas;
	private String enfermActuales;
	

	public Usuario(String nombre, String primerApellido, String segundoApellido,
			String sexo, String fecha, String DNI, String telefono, String via, String numeroEdificio,
			String provincia, String ciudad, String CP, String estadoCivil, String personaContacto1,
			String telefonoContacto1, String personaContacto2, String telefonoContacto2, String numSegSocial,
			String grupoSanguineo, String operaciones, String enfermPasadas, String enfermActuales) {
		
		this.setNombre(nombre);
		this.setPrimerApellido(primerApellido);
		this.setSegundoApellido(segundoApellido);
		
		this.setSexo(sexo);
		this.setFecha(fecha);
		this.setDNI(DNI);
		this.setTelefono(telefono);
		this.setVia(via);
		this.setNumeroEdificio(numeroEdificio);
		this.setProvincia(provincia);
		this.setCiudad(ciudad);
		this.setCP(CP);
		this.setEstadoCivil(estadoCivil);
		this.setPersonaContacto1(personaContacto1);
		this.setTelefonoContacto1(telefonoContacto1);
		this.setPersonaContacto2(personaContacto2);
		this.setTelefonoContacto2(telefonoContacto2);
		
		this.setNumSegSocial(numSegSocial);
		this.setGrupoSanguineo(grupoSanguineo);
		this.setOperaciones(operaciones);
		this.setEnfermPasadas(enfermPasadas);
		this.setEnfermActuales(enfermActuales);
		
	}
	
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getNumeroEdificio() {
		return numeroEdificio;
	}

	public void setNumeroEdificio(String numeroEdificio) {
		this.numeroEdificio = numeroEdificio;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCP() {
		return CP;
	}

	public void setCP(String cP) {
		CP = cP;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getPersonaContacto1() {
		return personaContacto1;
	}

	public void setPersonaContacto1(String personaContacto1) {
		this.personaContacto1 = personaContacto1;
	}

	public String getTelefonoContacto1() {
		return telefonoContacto1;
	}

	public void setTelefonoContacto1(String telefonoContacto1) {
		this.telefonoContacto1 = telefonoContacto1;
	}

	public String getPersonaContacto2() {
		return personaContacto2;
	}

	public void setPersonaContacto2(String personaContacto2) {
		this.personaContacto2 = personaContacto2;
	}

	public String getTelefonoContacto2() {
		return telefonoContacto2;
	}

	public void setTelefonoContacto2(String telefonoContacto2) {
		this.telefonoContacto2 = telefonoContacto2;
	}

	public String getNumSegSocial() {
		return numSegSocial;
	}

	public void setNumSegSocial(String numSegSocial) {
		this.numSegSocial = numSegSocial;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public String getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(String operaciones) {
		this.operaciones = operaciones;
	}

	public String getEnfermPasadas() {
		return enfermPasadas;
	}

	public void setEnfermPasadas(String enfermPasadas) {
		this.enfermPasadas = enfermPasadas;
	}

	public String getEnfermActuales() {
		return enfermActuales;
	}

	public void setEnfermActuales(String enfermActuales) {
		this.enfermActuales = enfermActuales;
	}


	
}
