package demo.designpatterns.iterator;

/**
 * Created by rogerxu on 2017/7/11.
 */
public class TVControl extends ChannelController {
	private TV tv;
	private int current;

	public TVControl(TV tv) {
		this.tv = tv;
	}

	@Override
	public Channel next() {
		current += 1;
		return tv.getChannel(current);
	}

	@Override
	public Channel previous() {
		current -= 1;
		return tv.getChannel(current);
	}
}
