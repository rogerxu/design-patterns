package demo.designpatterns.bridge;

import java.text.MessageFormat;

/**
 * Created by rogerxu on 2017/7/2.
 */
public class UnixImp implements ImageImp {
	@Override
	public void doPaint(String str) {
		System.out.println(MessageFormat.format("{0} at UnixOS", str));
	}
}
