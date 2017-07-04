package demo.designpatterns.facade;

/**
 * Created by rogerxu on 2017/7/4.
 */
public class TeaMaker {
	boolean teaBagIsSteeped;

	public TeaMaker() {
		System.out.println("Tea Maker is ready");
	}

	public TeaCup makeTea() {
		TeaCup teaCup = new TeaCup();
		TeaBag teaBag = new TeaBag();
		Water water = new Water();
		teaCup.addTeaBag(teaBag);
		water.boilWater();
		teaCup.addWater(water);
		teaCup.steepTeaBag();

		return teaCup;
	}
}
