package demo.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by rogerxu on 2017/7/13.
 */
public class EmployeeManager {
	private Stack<EmployeeMemento> stack = new Stack<EmployeeMemento>();

	private Employee employee = new Employee();

	public void displayEmployee() {
		System.out.println(employee.getId());
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getSalary());
	}

	public void saveEmployee(Employee employee) {
		EmployeeMemento memento = employee.getMemento();
		stack.push(memento);
	}

	public void loadEmployee() {
		try {
			EmployeeMemento memento = stack.pop();
			employee.setMemento(memento);
			displayEmployee();
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}
}
