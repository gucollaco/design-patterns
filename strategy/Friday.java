package strategy;

public class Friday implements Strategy {

	@Override
	public void message(int day) {
		System.out.println("Today is Friday");
		System.out.println(day);
	}

}
