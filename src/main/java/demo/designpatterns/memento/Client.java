package demo.designpatterns.memento;

/**
 * Created by rogerxu on 2017/7/13.
 */
public class Client {
	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();
		manager.saveEmployee(new Employee(1, "Adam", "Smith", 10000));
		manager.saveEmployee(new Employee(2, "Bill", "White", 20000));

		manager.loadEmployee();
		manager.loadEmployee();
	}
}
