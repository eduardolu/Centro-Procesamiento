package es.upm.dit.isst.process.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;





import es.upm.dit.isst.process.model.Alerta;
import es.upm.dit.isst.process.model.Usuario;



public class TaccDAOImpl implements TaccDAO {

	private static TaccDAOImpl instance;
	private TaccDAOImpl(){
	}
	
	public static TaccDAOImpl getInstance(){
		if (instance == null)
			instance = new TaccDAOImpl();
		return instance;
	}
	
	@Override
	public List<Usuario> listUsuarios() {
		// TODO Auto-generated method stub
		EntityManager em = EMFService.get().createEntityManager();
		// read the existing entries
		Query q = em.createQuery("select m from Usuario m");
		List<Usuario> usuarios = q.getResultList();
		return usuarios;
	}

	@Override
	public void add(String nombre, String primerApellido, String segundoApellido,
			String sexo, String fecha, String DNI, String telefono, String via, String numeroEdificio,
			String provincia, String ciudad, String CP, String estadoCivil, String personaContacto1,
			String telefonoContacto1, String personaContacto2, String telefonoContacto2, String numSegSocial,
			String grupoSanguineo, String operaciones, String enfermPasadas, String enfermActuales) {
		// TODO Auto-generated method stub
		synchronized (this) {
			EntityManager em = EMFService.get().createEntityManager();
			Usuario usuario = new Usuario(nombre, primerApellido, segundoApellido,
					sexo, fecha, DNI, telefono, via, numeroEdificio,
					provincia, ciudad, CP, estadoCivil, personaContacto1,
					telefonoContacto1, personaContacto2, telefonoContacto2, numSegSocial,
					grupoSanguineo, operaciones, enfermPasadas, enfermActuales);
			em.persist(usuario);
			em.close();
		}
	}

	@Override
	public List<Usuario> getUsuarios(String nombre) {
		// TODO Auto-generated method stub
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select t from Usuario t where t.nombre =:nombre");
		q.setParameter("nombre", nombre);
		List<Usuario> usuarios = q.getResultList();
		return usuarios;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		EntityManager em = EMFService.get().createEntityManager();
		try {
			Usuario usuario = em.find(Usuario.class, id);
			em.remove(usuario);
		} finally {
			em.close();
		}
	}
	
	@Override
	public void delete(){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("DELETE FROM Usuario m");
		q.executeUpdate();
	}

	@Override
	public List<String> getUsers() {
		// TODO Auto-generated method stub
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select distinct t.author from Usuario t");
		List<String> users = q.getResultList();
		return users;
	}
	@Override
	public List<Alerta> listAlertas(){
		EntityManager em = EMFService.get().createEntityManager();
		// read the existing entries
		Query q = em.createQuery("select a from Alerta a");
		List<Alerta> alertas = q.getResultList();
		return alertas;
	}
	
	@Override
	public void addAlerta(String tipo, String subtipo){
		synchronized (this) {
			EntityManager em = EMFService.get().createEntityManager();
			Alerta alerta = new Alerta(tipo, subtipo);
			em.persist(alerta);
			em.close();
		}
		
	}
	
	@Override
	public void removeAlerta(long id){
		EntityManager em = EMFService.get().createEntityManager();
		try {
			Alerta alerta = em.find(Alerta.class, id);
			em.remove(alerta);
		} finally {
			em.close();
		}
	}

}
