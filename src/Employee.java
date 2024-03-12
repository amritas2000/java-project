import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private int age;
	private double salary;
	
	Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> el = new ArrayList<Employee>();
		
		el.add(new Employee("Amrita",23, 6000000));
		el.add(new Employee("Chiku",43, 8000000));
		el.add(new Employee("Ams",24, 3000000));
		
		
		

	}

}
