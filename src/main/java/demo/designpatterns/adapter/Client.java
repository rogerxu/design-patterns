package demo.designpatterns.adapter;

/**
 * Created by rogerxu on 2017/7/1.
 */
public class Client {
	static void Jobs(Clean job) {
		if (job instanceof Clean) {
			job.makeClean();
		}

		if (job instanceof Extra) {
			((Extra) job).takeCare();
		}
	}

	public static void main(String[] args) {
		Extra extra = new Facility();
		Jobs(extra);

		Clean c1 = new Office();
		Clean c2 = new Workshop();
		Jobs(c1);
		Jobs(c2);
	}
}
