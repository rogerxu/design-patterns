package demo.designpatterns.adapter;

/**
 * Created by rogerxu on 2017/7/1.
 */
public class Office implements Clean {

	@Override
	public void makeClean() {
		System.out.println("Clean office");
	}
}
