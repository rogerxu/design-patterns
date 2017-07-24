package demo.designpatterns.templatemethod;

public abstract class DataObject {
	public abstract void connect();
	public abstract void select();
	public abstract void process();
	public abstract void disconnect();

	public void run() {
		connect();
		select();
		process();
		disconnect();
	}
}
