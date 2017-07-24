package demo.designpatterns.templatemethod;

public class CustomerDataObject extends DataObject {
	private String connectionString = "Server=.;UserID=sa;password=123;database=Northwind;ConnectionReset=FALSE";

	private String commandString;

	@Override
	public void connect() {
		System.out.println(connectionString);
	}

	@Override
	public void select() {
		commandString = "select top 5 Name from Customers";
		System.out.println(commandString);
	}

	@Override
	public void process() {
		System.out.println("process");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
	}
}
