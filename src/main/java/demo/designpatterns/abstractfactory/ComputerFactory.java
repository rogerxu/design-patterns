package demo.designpatterns.abstractfactory;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/6/26.
 */
public abstract class ComputerFactory {
	CPU cpu;
	HardDisk hd;
	MainBoard mb;

	public void show() {
		try {
			System.out.println(MessageFormat.format("{0} manifest", this.getClass().getSimpleName()));
			System.out.println(MessageFormat.format("CPU: {0}", cpu.getCPU()));
			System.out.println(MessageFormat.format("Hard disk: {0}", hd.getSize()));
			System.out.print("Mainboard:");
			mb.attach(cpu);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
