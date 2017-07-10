package demo.designpatterns.interpreter;

/**
 * Created by rogerxu on 2017/7/10.
 */
public interface Node {
	void parse(Context context);
	void execute();
}
