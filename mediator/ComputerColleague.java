package mediator;

public class ComputerColleague extends Colleague {
	public ComputerColleague(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receiveCommunication(String communication) {
		System.out.println(communication + " VS Computer player (random opponent)");
	}
}