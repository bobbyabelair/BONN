package bonnzork;

import java.util.ArrayList;

public class Rooms {
	String roomName;
	String roomDesc;
	
	
	
	public Rooms() {
		roomName = new String();
		roomDesc = new String();
		
	}
	public Rooms(String name) {
		roomName = name;
		roomDesc = new String();
		
	}
	public Rooms(String name, String desc) {
		roomName = name;
		roomDesc = desc;
		
	}
	public void setRoomName (String name) {
		this.roomName = name;
	}

	public void setRoomdesc(String desc) {
		this.roomDesc = desc;
	}
	public String getRoomName () {
		return roomName;
	}
	public String getRoomdesc() {
		return roomDesc;
	}
	
	
}
