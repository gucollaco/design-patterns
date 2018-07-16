package state;

public class DoorStayopen extends DoorState{

	public DoorStayopen(Door_1 door) {
		super(door);
	}

	@Override
	public void touch() {
		door.setState(door.CLOSING);
	}

	@Override
	public void complete() {
		
	}

	@Override
	public String getState() {
		return "StayOpen";
	}

	@Override
	public void timeout() {
		
	}

}
