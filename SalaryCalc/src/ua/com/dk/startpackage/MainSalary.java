package ua.com.dk.startpackage;

import java.util.Scanner;

public class MainSalary {

	public static void main(String[] args) {

		Employer employer1 = new Employer();
		
		employer1.setName("Петров");
		employer1.setPosition("Программист");
		employer1.setExpirients(4);
		employer1.setSalary(new Salary(10000));
//		employer1.print();
		
		employer1.changePosition("Веб дизайнер");
//		
		employer1.addExpirients();
//		employer1.print();
		
		employer1.getSalary().changeSalarySize(1.12);
//		employer1.print();
		
		Employer employer2 = new Employer("Иванов", "Директор", 15, new Salary(20000));		
//		employer2.print();
		
		employer2.getSalary().changeSalarySize(0.9);
//		employer2.print();
		
		Employer employer3 = new Employer();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name");
		employer3.setName(in.nextLine());
		System.out.println("Enter position");
		employer3.setPosition(in.nextLine());
		System.out.println("Enter expirients");
		employer3.setExpirients(in.nextInt());
		System.out.println("Enter salary");
		employer3.setSalary(new Salary(in.nextDouble()));
		
		in.close();
		
		employer3.print();

	}

}
