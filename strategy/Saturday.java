package strategy;

public class Saturday implements Strategy {

	@Override
	public void message(int day) {
		System.out.println("Today is Saturday");
		System.out.println(day);
	}

}
