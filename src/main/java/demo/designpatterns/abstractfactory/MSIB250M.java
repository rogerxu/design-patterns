package demo.designpatterns.abstractfactory;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/6/26.
 */
public class MSIB250M implements MainBoard {
	@Override
	public void attach(CPU cpu) throws Exception {
		if (cpu.getClass().getSimpleName().endsWith("Intel")) {
			System.out.println(this.getClass().getSimpleName());
		} else {
			throw new Exception(MessageFormat.format("Mainboard {0} only supports Intel CPU", this.getClass().getSimpleName()));
		}
	}
}
