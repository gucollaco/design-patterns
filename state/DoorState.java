package state;

public abstract class DoorState {
	Door_1 door;
	
	public DoorState(Door_1 door) {
		this.door = door;
	}
	
	public abstract void touch();
	public abstract void complete();
	public abstract String getState();
	public abstract void timeout();
}
