package state;

public class DoorClosing extends DoorState {
	public DoorClosing(Door_1 door) {
		super(door);
	}
	
	public void touch() {
		door.setState(door.OPENING);
	}
	public void complete() {
		door.setState(door.CLOSED);
	}
	
	public String getState() {
		return "Closing";
	}
	
	public void timeout() {
	}
}
