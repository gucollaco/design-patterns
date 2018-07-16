package strategy;

public class Sunday implements Strategy {

	@Override
	public void message(int day) {
		System.out.println("Today is Sunday");
		System.out.println(day);
	}

}
