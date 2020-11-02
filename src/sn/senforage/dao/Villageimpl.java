package sn.senforage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sn.senforage.entities.Client;
import sn.senforage.entities.Village;

public class Villageimpl implements IVillage{
	private EntityManager em;
	public Villageimpl() {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("ProjetJSPServlet");
		em = emf.createEntityManager();
	}
	
	
	
	

	@Override
	public int add(Village village) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.persist(village);
			em.getTransaction().commit();
			return 1;
		} catch (Exception ex) {
			return 0;
		}
		// TODO Auto-generated method stub
		
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Village> list() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("select v from Village v", Village.class);
        return query.getResultList();
	}





	@Override
	public Village getVillageById(int id) {
		Village village = em.find(Village.class, id);
		return village;
	}
}
