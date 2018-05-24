package mediator;

public class PlaystationColleague extends Colleague {
	public PlaystationColleague(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receiveCommunication(String communication) {
		System.out.println(communication + " VS Playstation player (random opponent)");
	}
}