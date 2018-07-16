package strategy;

public class Tuesday implements Strategy {

	@Override
	public void message(int day) {
		System.out.println("Today is Tuesdays");
		System.out.println(day);
	}

}
