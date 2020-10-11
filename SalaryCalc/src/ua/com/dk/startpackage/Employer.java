package ua.com.dk.startpackage;

public class Employer {
	private String name; 
	private String position;
	private int expirients;
	private Salary salary;
	
	public Employer() {
		
	}
	
	public Employer(String n, String pos, int exp, Salary sal) {
		setName(n);
		setPosition(pos);
		setExpirients(exp);
		setSalary(sal);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != "Vasya") {
		this.name = name;
		}
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getExpirients() {
		return expirients;
	}

	public void setExpirients(int expirients) {
		this.expirients = expirients;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	
	// изменение должности
	public void changePosition(String newpos) {
		this.position = newpos ;
		System.out.println("\nPosition was changed");
	}
	
	// увеличение опыта работы 
	public int addExpirients() {
		expirients = expirients + 1;
		System.out.println("\nExpirients was changed");
		return expirients;
	}
	
	
	
	public void print() {
		System.out.println();
		System.out.println("Employer");
		System.out.println("Name = " + getName());
		System.out.println("Position = " + getPosition());
		System.out.println("Expirients = " + getExpirients() + " years");
		System.out.println("Salary = " + salary.getSize() + " UAH");

	}

}
