package state;

public class DoorClosed extends DoorState{
	public DoorClosed(Door_1 door) {
		super(door);
	}

	@Override
	public void touch() {
		door.setState(door.OPENING);
	}

	@Override
	public void complete() {
	}

	@Override
	public String getState() {
		return "Closed";
	}

	@Override
	public void timeout() {
		
	}
}
