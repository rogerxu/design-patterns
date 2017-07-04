package demo.designpatterns.facade;

/**
 * Created by rogerxu on 2017/7/4.
 */
public class Water {
	boolean waterIsBoiling;

	public Water() {
		setWaterIsBoiling(false);
		System.out.println("water is ready");
	}

	public void boilWater() {
		setWaterIsBoiling(true);
		System.out.println("water is boiling");
	}

	public void setWaterIsBoiling(boolean isWaterBoiling) {
		waterIsBoiling = isWaterBoiling;
	}

	public boolean getWaterIsBoiling() {
		return waterIsBoiling;
	}
}
