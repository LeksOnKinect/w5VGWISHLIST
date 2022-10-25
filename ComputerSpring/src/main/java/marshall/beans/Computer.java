package marshall.beans;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Computer {
	@Id 
	@GeneratedValue 
	private long id;
	
	private String name;
	private char model;
	private short year ;
	private double price;
	/**
	 * @param id
	 * @param name
	 * @param model
	 * @param year
	 * @param price
	 */
	public Computer(long id, String name, char model, short year, double price) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	/**
	 * @param name
	 * @param model
	 * @param year
	 * @param price
	 */
	public Computer(String name, char model, short year, double price) {
		this.name = name;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	/**
	 * 
	 */
	public Computer() {
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the model
	 */
	public char getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(char model) {
		this.model = model;
	}
	/**
	 * @return the year
	 */
	public short getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(short year) {
		this.year = year;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", model=" + model + ", year=" + year + ", price=" + price
				+ "]";
	}

}
