package demo.designpatterns.memento;

/**
 * Created by rogerxu on 2017/7/13.
 */
public class EmployeeMemento {
	int id;
	String firstName;
	String lastName;
	int salary;

	EmployeeMemento(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
}
