package demo.designpatterns.adapter;

/**
 * Created by rogerxu on 2017/7/1.
 */
public class Workshop implements Clean {

	@Override
	public void makeClean() {
		System.out.println("Clean workshop");
	}
}
