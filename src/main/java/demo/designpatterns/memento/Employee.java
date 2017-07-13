package demo.designpatterns.memento;

/**
 * Created by rogerxu on 2017/7/13.
 */
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee() {

	}

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public EmployeeMemento getMemento() {
		return new EmployeeMemento(id, firstName, lastName, salary);
	}

	public void setMemento(EmployeeMemento memento) {
		id = memento.id;
		firstName = memento.firstName;
		lastName = memento.lastName;
		salary = memento.salary;
	}
}
