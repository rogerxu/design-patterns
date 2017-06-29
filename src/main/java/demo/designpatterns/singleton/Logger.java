package demo.designpatterns.singleton;

import java.util.Properties;

/**
 * Created by rogerxu on 2017/6/29.
 */
public class Logger {

	private Logger() {
		logger = this;
	}

	public static void init() {
		logger = new Logger();
	}

	private static Logger logger;

	public static Logger getLogger() {
		return logger;
	}
}
