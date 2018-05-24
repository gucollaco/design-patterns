package mediator;

import java.util.ArrayList;
import java.util.Random;

public class PlayMediator implements Mediator {
	private ArrayList<Colleague> interactions;
	
	public PlayMediator() {
		setInteractions(new ArrayList<Colleague>());
	}
	
	public void addColleague(Colleague colleague) {
		interactions.add(colleague);
	}
	
	@Override
	public void communicate(String communication, Colleague colleague) {
		Random random = new Random();
		int i = random.nextInt(interactions.size());
		
		while(interactions.get(i) == colleague) {
			i = random.nextInt(interactions.size());
		}
		
		definePlatform(colleague);
		interactions.get(i).receiveCommunication(communication);
	}
	
	public void definePlatform(Colleague colleague) {
		if(colleague instanceof XboxColleague) {
			System.out.print("I'm a Xbox player -> ");
		} else if(colleague instanceof PlaystationColleague) {
			System.out.print("I'm a Playstation player -> ");			
		} else if(colleague instanceof ComputerColleague) {
			System.out.print("I'm a Computer player -> ");
		}
	}
	
	public ArrayList<Colleague> getInteractions() {
		return interactions;
	}
	
	public void setInteractions(ArrayList<Colleague> interactions) {
		this.interactions = interactions;
	}
}