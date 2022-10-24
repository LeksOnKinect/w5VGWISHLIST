package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wisher")
public class Wisher {
	@Id
	@GeneratedValue
	private int id;
	private String wisherName;
	
	public Wisher() {
		super();
	}
	public Wisher(int id, String wisherName) {
		super();
		this.id = id;
		this.wisherName = wisherName;
	}
	
	public Wisher(String wisherName) {
		super();
		this.wisherName = wisherName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWisherName() {
		return wisherName;
	}
	public void setWisherName(String wisherName) {
		this.wisherName = wisherName;
	}
	@Override
	public String toString() {
		return "Wisher [id=" + id + ", wisherName=" + wisherName + "]";
	}
	
}
