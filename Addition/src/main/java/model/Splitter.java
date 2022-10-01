package model;

public class Splitter {
	public int total;
	public int quarters;
	public int tenths;
	public int hundredths;
	
	public Splitter() {
		super(); 
	}
	
	public Splitter(int total) {
		super();
		this.total = total;
		setSplits(total);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getQuarters() {
		return quarters;
	}

	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}

	public int getTenths() {
		return tenths;
	}

	public void setTenths(int tenths) {
		this.tenths = tenths;
	}

	public int getHundredths() {
		return hundredths;
	}

	public void setHundredths(int hundreths) {
		this.hundredths = hundreths;
	}
	public void setSplits(int total) {
		final int QUARTERS=4;//number of 1/4s in 1
		final int TENTHS= 10;
		final int HUNDREDTHS =100;
		
		setQuarters(total * QUARTERS);
		setTenths(total * TENTHS);
		setHundredths(total * HUNDREDTHS);
		
		
	}
	@Override
	public String toString() {
		return "Fractionifier(turned into fractions) "+
	total + " = " + quarters + "/4ths or " + tenths +
	"/10ths or lastly " + hundredths + "/100ths";
	}
}
