/**
 * @author lexer - lemarshall1
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package model;

/**
 * @author lexer
 *
 */
public class PokemonCard {
	private String name;
	private int healthPoints;
	private int maxHealth;
	
	private int attackDamage;
	private String type;
	/**
	 * @return the name
	 */
	public PokemonCard() {
		
	}
	
	/**
	 * @param name
	 * @param healthPoints
	 * @param attackDamage
	 * @param type
	 */
	public PokemonCard(String name,int maxHealth, int healthPoints, int attackDamage, String type) {
		super();
		this.name = name;
		this.healthPoints = healthPoints;
		this.attackDamage = attackDamage;
		this.type = type;
	}

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
	 * @return the healthPoints
	 */
	public int getHealthPoints() {
		return healthPoints;
	}
	/**
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	/**
	 * @return the attackDamage
	 */
	public int getAttackDamage() {
		return attackDamage;
	}
	/**
	 * @param attackDamage the attackDamage to set
	 *//**
	 * @return the maxHealth
	 */
	public int getMaxHealth() {
		return maxHealth;
	}

	/**
	 * @param maxHealth the maxHealth to set
	 */
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	public boolean isdead() {//use this everytime something attacks
		if (healthPoints <= 0) {
			return true;
		} else {
			return false;
		}
	}
	public String strongAgainst() {
		if (type.equals("Fire")) {
			return "ice";
		} else if (type.equals("water")) {
			return "fire";
		} else if (type.equals("ice")) {
			return "water";
		} else {
			return "no type";
		}
	}
	public double attackSelf() {//for some reason the pokemon missed its enemy and hit itself
		double currentHP = healthPoints - attackDamage;
		return currentHP;
	}
}
