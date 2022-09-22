package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListItem;

public class ListItemHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("VGWishList");
	public void insertItem(ListItem li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}
	public List<ListItem>showAllItems(){
		EntityManager em = emfactory.createEntityManager();
		List<ListItem>allItems = em.createQuery("SELECT i FROM ListItem i").getResultList();
		return allItems;
	}
	public void updateItem(ListItem toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}	
	public void deleteItem(ListItem toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListItem>typedQuery = em.createQuery("select li from ListItem li where li.console = :selectedConsole and li.game = :selectedGame", ListItem.class);
		//Substitute parameter with actual data from the toDelete item
		typedQuery.setParameter("selectedConsole", toDelete.getConsole());
		typedQuery.setParameter("selectedGame", toDelete.getGame());
		//we only want one result
		typedQuery.setMaxResults(1);
		//get the result and save it into a new list item
		ListItem result = typedQuery.getSingleResult();
		//remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	public List<ListItem> searchForItemByConsole(String consoleName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListItem>typedQuery = em.createQuery("select li from ListItem li where li.console = := selectedConsole", ListItem.class);
		typedQuery.setParameter("selectedConsole", consoleName);
		List<ListItem> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}
	public List<ListItem> searchForItemByGame(String gameName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListItem> typedQuery = em.createQuery("select li fromListItem li where li.game = :selectedGame", ListItem.class);
		typedQuery.setParameter("selectedGame", gameName);
		List<ListItem> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}
	public ListItem searchForItemById(int idToEdit) {
	// TODO Auto-generated method stub
	EntityManager em = emfactory.createEntityManager();
	em.getTransaction().begin();
	ListItem found = em.find(ListItem.class, idToEdit);
	em.close();
	return found;
	}
	public void cleanUp() {
		emfactory.close();
	}
}
