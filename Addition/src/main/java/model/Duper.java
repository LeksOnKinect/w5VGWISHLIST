package model;

public class Duper {
	//this means duplicator
	// sorry bad name choice
	public int total;
	public int x2;
	public int x5;
	public int x1000;
	public Duper() {
		super();
	}
	public Duper(int total) {
		super();
		this.total= total;
		setDupes(total);
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getX5() {
		return x5;
	}
	public void setX5(int x5) {
		this.x5 = x5;
	}
	public int getX1000() {
		return x1000;
	}
	public void setX1000(int x1000) {
		this.x1000 = x1000;
	}
	
	public void setDupes(int total){
		final int FIVE = 5;
		final int TWO = 2;//unneccessary variables
		final int ONETHOUSAND = 1000;
		
		setX2(total * TWO);//could've just typed 2 total * 2
		setX5(total * FIVE);
		setX1000(total * ONETHOUSAND);
	}
	
	@Override
	public String toString() {
		return "Duper(multiplier) turns the difference, " + total + ", into"+
				x2 + " when multiplied by 2, and " + x5 + "when multiplied by 5, " +
				" and lastly whin it is multiplied by 1000, it is " + x1000 + ". ";
	}
	
	
	
}
