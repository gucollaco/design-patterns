package strategy;

public class Thursday implements Strategy {

	@Override
	public void message(int day) {
		System.out.println("Today is Thursday");
		System.out.println(day);
	}

}
