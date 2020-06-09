package entities;

public class Employee {

	private int id;
	double salary;
	private String name;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public void percent(double x) {
		double salary = this.salary + this.salary * x / 100;
		setSalary(salary);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + ", " + name + ", " + salary;
	}

}
