package strategy;

public class Wednesday implements Strategy {

	@Override
	public void message(int day) {
		System.out.println("Today is Wednesday");
		System.out.println(day);
	}

}
