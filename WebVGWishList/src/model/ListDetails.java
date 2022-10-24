package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class ListDetails {
	@Id
	@GeneratedValue
	private int id;
	private String listName;
	private LocalDate wishDate;
	@ManyToOne (cascade=CascadeType.PERSIST)
	private Wisher wisher;
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<ListItem> listOfItems;
	
	public ListDetails() {
		super();
	}

	public ListDetails(int id, String listName, LocalDate wishDate, Wisher wisher, List<ListItem> listOfItems) {
		this.id = id;
		this.listName = listName;
		this.wishDate = wishDate;
		this.wisher = wisher;
		this.listOfItems = listOfItems;
	}
	
	public ListDetails(String listName, LocalDate wishDate, Wisher wisher, List<ListItem> listOfItems) {
		this.listName = listName;
		this.wishDate = wishDate;
		this.wisher = wisher;
		this.listOfItems = listOfItems;
	}
	
	public ListDetails(String listName, LocalDate wishDate, Wisher wisher) {
		this.listName = listName;
		this.wishDate = wishDate;
		this.wisher = wisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public LocalDate getWishDate() {
		return wishDate;
	}

	public void setWishDate(LocalDate wishDate) {
		this.wishDate = wishDate;
	}

	public Wisher getWisher() {
		return wisher;
	}

	public void setWisher(Wisher wisher) {
		this.wisher = wisher;
	}

	public List<ListItem> getListOfItems() {
		return listOfItems;
	}

	public void setListOfItems(List<ListItem> listOfItems) {
		this.listOfItems = listOfItems;
	}

	@Override
	public String toString() {
		return "ListDetails [id=" + id + ", listName=" + listName + ", wishDate=" + wishDate + ", wisher=" + wisher
				+ ", listOfItems=" + listOfItems + "]";
	}
	
	
}
