package state;

public class DoorOpen extends DoorState{
	public DoorOpen(Door_1 door) {
		super(door);
	}

	@Override
	public void touch() {
		door.setState(door.STAYOPEN);
	}

	@Override
	public void complete() {
		
	}

	@Override
	public String getState() {
		return "Open";
	}

	@Override
	public void timeout() {	
		door.setState(door.CLOSING);
	}
}
