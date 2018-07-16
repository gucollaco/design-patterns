package strategy;

public class Monday implements Strategy {

	@Override
	public void message(int day) {
		System.out.println("Today is Monday");
		System.out.println(day);
	}
	
}
