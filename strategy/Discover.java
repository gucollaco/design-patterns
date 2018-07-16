package strategy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Discover {
	
	private Strategy action = new DefaultStrategy();
	private GregorianCalendar cal = new GregorianCalendar();
	private int day = cal.get(Calendar.DAY_OF_WEEK);
	
	public void defineStrategy() {
		switch(day) {
			case 0:
				action = new Saturday();
				break;
			case 1:
				action = new Sunday();
				break;
			case 2:
				action = new Monday();
				break;
			case 3:
				action = new Tuesday();
				break;
			case 4:
				action = new Wednesday();
				break;
			case 5:
				action = new Thursday();
				break;
			default:
				action = new Friday();
				break;
		}
	}
	
	public void displayMessage() {
		action.message(day);
	}
	
}
