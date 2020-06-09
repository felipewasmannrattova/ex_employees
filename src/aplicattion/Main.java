package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

		char p,r;
		int cont = 1;
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		do {
			do {
			System.out.println("Employees #" + cont + ":");
			System.out.print("id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("Add more Employees? (s/n)");
			p = sc.next().charAt(0);
			list.add(new Employee(id, name, salary));
			cont += 1;
		} while (p == 's');

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null)
			System.out.println("This id does not exist!");

		else {
			System.out.print("Enter the percentage: ");
			double y = sc.nextDouble();
			emp.percent(y);
		}
		System.out.println("List of employees:");

		for (Employee x : list) {
			System.out.println(x);
		}
System.out.print("Do you want to perform a new operation? (s/n)");
r=sc.next().charAt(0);
		}while (r=='s');
				sc.close();
	}
}
