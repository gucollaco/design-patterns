package proxy;

public class Intermediario implements Sujeito {
	private SujeitoReal real;
	public Object operacao() {
		real = (SujeitoReal) Fabrica.getSujeito();
		System.out.println("Retornando string:");
		return real.operacao();
	}
}
