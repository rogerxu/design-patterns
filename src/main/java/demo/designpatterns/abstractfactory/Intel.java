package demo.designpatterns.abstractfactory;

/**
 * Created by rogerxu on 2017/6/26.
 */
public class Intel implements CPU {
	@Override
	public String getCPU() {
		return "Core i7 6770";
	}
}
