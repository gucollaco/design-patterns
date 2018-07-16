package state;

public class DoorOpening extends DoorState{
	public DoorOpening(Door_1 door) {
		super(door);
	}

	@Override
	public void touch() {
		door.setState(door.CLOSING);
	}

	@Override
	public void complete() {
		door.setState(door.OPEN);
	}

	@Override
	public String getState() {
		return "Opening";
	}

	@Override
	public void timeout() {		
	}
}
