package ua.com.dk.startpackage;

public class Salary {
	private double size;
	
	public Salary(double s) {
		setSize(s);
	}
	
	public double getSize() {
		return size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	

	public double changeSalarySize(double percent) {
		size = size * percent;
		System.out.println("Salary.size was changed");
		return size;
	}
	public double pay() {
		System.out.println("You earn your salary = " + size);
		return size;
	}
}
