package state;

import java.util.Observable;

public class Door_1 extends Observable {
	public final DoorState CLOSED = new DoorClosed(this);
	public final DoorState OPENING = new DoorOpening(this);
	public final DoorState OPEN = new DoorOpen(this);
	public final DoorState CLOSING = new DoorClosing(this);
	public final DoorState STAYOPEN = new DoorStayopen(this);
	private DoorState state = CLOSED;
	
	public String status() {
		return state.getState();
	}
	
	public void setState(DoorState state) {
		this.state = state;
		setChanged();
		notifyObservers();
	}
	
	public void complete() {
		state.complete();
	}
	
	public void timeout() {
		state.timeout();
	}
	
	public void touch() {
		state.touch();
	}
}
