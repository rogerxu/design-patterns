package demo.designpatterns.facade;

/**
 * Created by rogerxu on 2017/7/4.
 */
public class TeaCup {
	boolean teaBagIsSteeped;
	Water water;
	TeaBag teaBag;

	public TeaCup() {
		setTeaBagIsSteeped(false);
		System.out.println("tea cup is ready");
	}

	public void setTeaBagIsSteeped(boolean isTeaBagSteeped) {
		teaBagIsSteeped = isTeaBagSteeped;
	}

	public boolean getTeaBagIsSteeped() {
	    return teaBagIsSteeped;
	}

	public void addTeaBag(TeaBag teaBagIn) {
		teaBag = teaBagIn;
		System.out.println("tea bag is in the tea cup");
	}

	public void addWater(Water waterIn) {
		water = waterIn;
		System.out.println("water is in the tea cup");
	}

	public void steepTeaBag() {
		if (teaBag != null && water != null && water.getWaterIsBoiling()) {
			System.out.println("tea is in the tea cup");
			setTeaBagIsSteeped(true);
		} else {
			System.out.println("tea is not in the tea cup");
			setTeaBagIsSteeped(false);
		}
	}
}
