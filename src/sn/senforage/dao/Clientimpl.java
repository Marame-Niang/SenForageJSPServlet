package sn.senforage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sn.senforage.entities.Client;

public class Clientimpl implements IClient{

	private EntityManager em;
	public Clientimpl() {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("ProjetJSPServlet");
		em = emf.createEntityManager();
	}
	
	@Override
	public int add(Client client) {
		try {
			em.getTransaction().begin();
			em.persist(client);
			em.getTransaction().commit();
			return 1;
		} catch (Exception ex) {
			return 0;
		}
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> list() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("select c from Client c", Client.class);
        return query.getResultList();
		
		
	}

}
