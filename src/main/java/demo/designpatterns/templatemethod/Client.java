package demo.designpatterns.templatemethod;

public class Client {
	public static void main(String[] args) {
		DataObject dataObject = new CustomerDataObject();
		dataObject.run();
	}
}
