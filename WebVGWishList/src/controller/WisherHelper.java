package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Wisher;

public class WisherHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("WishList");
	
	public void insertWish(Wisher w) {
		EntityManager em  = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(w);
		em.getTransaction().commit();
		em.close();
	}
	public List<Wisher> showAllWishers(){
		EntityManager em = emfactory.createEntityManager();
		List<Wisher> allWishers = em.createQuery("SELECT w FROM Wisher w").getResultList();
		return allWishers;
	}
	public Wisher findWisher(String nameToLookUp) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Wisher> typedQuery = em.createQuery("select w from"
				+ " Wisher w where w.wisherName = :selectedName", Wisher.class);
		typedQuery.setParameter("selectedName", nameToLookUp);
		typedQuery.setMaxResults(1);
		Wisher foundWisher;
		try {
			foundWisher = typedQuery.getSingleResult();
		} catch (NoResultException ex) {
			foundWisher = new Wisher(nameToLookUp);
		}
		em.close();
		return foundWisher;
	}
}
