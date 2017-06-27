package demo.designpatterns.builder;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rogerxu on 2017/6/27.
 */
public class Apartment implements House {
	private boolean hasBackyard;
	private List<Room> rooms;

	public Apartment() {
		rooms = new ArrayList<Room>();

		Room room = new Room();
		room.roomName = "Master Room";
		rooms.add(room);

		room = new Room();
		room.roomName = "Second Bedroom";
		rooms.add(room);

		room = new Room();
		room.roomName = "Living Room";
		rooms.add(room);

		hasBackyard = false;
	}

	@Override
	public boolean getBackyard() {
		return hasBackyard;
	}

	@Override
	public long noOfRooms() {
		return rooms.size();
	}

	@Override
	public String description() {
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter, true);
		writer.println(MessageFormat.format("This is an apartment which has {0} rooms.", rooms.size()));
		writer.println("This apartment does not have backyard.");

		for (int i = 1; i <= rooms.size(); i++) {
			writer.println(MessageFormat.format("Room {0}\t{1}", i, rooms.get(i - 1).roomName));
		}

		return stringWriter.toString();
	}
}
