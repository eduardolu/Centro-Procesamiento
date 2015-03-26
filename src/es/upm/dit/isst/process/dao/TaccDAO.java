package es.upm.dit.isst.process.dao;

import java.util.List;

import es.upm.dit.isst.process.model.*;

public interface TaccDAO {
	//Usuarios
	public List<Usuario> listUsuarios();
	public void add (String nombre, String primerApellido, String segundoApellido,
			String sexo, String fecha, String DNI, String telefono, String via, String numeroEdificio,
			String provincia, String ciudad, String CP, String estadoCivil, String personaContacto1,
			String telefonoContacto1, String personaContacto2, String telefonoContacto2, String numSegSocial,
			String grupoSanguineo, String operaciones, String enfermPasadas, String enfermActuales);
	public List<Usuario> getUsuarios(String nombre);
	public void remove (long id);
	public List<String> getUsers();
	public void delete();
	
	//Alertas
	public List<Alerta> listAlertas();
	public void addAlerta(String tipo, String subtipo);
	public void removeAlerta(long id);
	
}
