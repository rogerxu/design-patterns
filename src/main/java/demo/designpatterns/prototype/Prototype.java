package demo.designpatterns.prototype;

/**
 * Created by rogerxu on 2017/6/29.
 */
public interface Prototype extends Cloneable {
	public Object clone();
	public String getName();
}
