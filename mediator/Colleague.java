package mediator;

public abstract class Colleague {
	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void sendCommunication(String communication) {
		mediator.communicate(communication, this);
	}
	
	public abstract void receiveCommunication(String communication);
}