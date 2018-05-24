package mediator;

public class Application {
	public static void main(String[] args) {
		PlayMediator mediator = new PlayMediator();
		
		Colleague xbox = new XboxColleague(mediator);
		Colleague playstation = new PlaystationColleague(mediator);
		Colleague computer = new ComputerColleague(mediator);
		
		mediator.addColleague(xbox);
		mediator.addColleague(playstation);
		mediator.addColleague(computer);
		
		xbox.sendCommunication("Xbox player");
		playstation.sendCommunication("Playstation player");
		computer.sendCommunication("Computer player");
	}
}
