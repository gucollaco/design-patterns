package proxy;

public class Fabrica {
	private Fabrica() {};
	private static Sujeito inst = null;
	public static Sujeito getSujeito() {
		if(inst == null) {
			inst = new SujeitoReal();
		}
		return inst;
	}
}
