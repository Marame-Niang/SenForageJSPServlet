package sn.senforage.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import sn.senforage.entities.User;

public abstract class Userimpl implements IUser{
	
	/*private EntityManagerFactory factory = Persistence 
			.createEntityManagerFactory("users"); 
	private EntityManager em = factory.createEntityManager(); 
	public User getUser(String nameUser, String password) { 
		try { 
				User user = (User) em .createQuery( 
					"SELECT u from User u where u.nomUtilisateur = :utilisateur and u.motdepasse = :motdepasse") 
					.setParameter("utilisateur", nomUtilisateur) 
					.setParameter("motdepasse", motdepasse).getSingleResult(); 
				return user; 
			} catch (NoResultException e) { 
				
				return null; 
				
			} 
		} 
	public boolean inserirUser(User user) { 
		try { 
			em.persist(user); 
			return true; 
			
			} 
		catch (Exception e) { 
			e.printStackTrace(); 
			return false; 

		} 
		} 
	public boolean deletarUser(User user) { 
		try { 
			em.remove(user); 
			return true; 
			} catch (Exception e) { 
				e.printStackTrace(); 
				return false; 
			} 
		}
	
	@Override
	public User getAll(String username) {
		// TODO Auto-generated method stub
		return null;
	} */

}
