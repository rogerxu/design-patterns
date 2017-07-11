package demo.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rogerxu on 2017/7/11.
 */
public class TV extends ChannelCollection {
	private List<Channel> channels = new ArrayList<Channel>();

	@Override
	public ChannelController createControl() {
		return new TVControl(this);
	}

	public void addChannel(Channel channel) {
		channels.add(channel);
	}

	public Channel getChannel(int index) {
		return channels.get(index);
	}
}
