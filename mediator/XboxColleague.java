package mediator;

public class XboxColleague extends Colleague {
	public XboxColleague(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receiveCommunication(String communication) {
		System.out.println(communication + " VS Xbox player (random opponent)");
	}
}