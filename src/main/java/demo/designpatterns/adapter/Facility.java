package demo.designpatterns.adapter;

/**
 * Created by rogerxu on 2017/7/1.
 */
public class Facility implements Extra {
	@Override
	public void makeClean() {
		System.out.println("Clean facility");
	}

	@Override
	public void takeCare() {
		System.out.println("Take care facility");
	}
}
