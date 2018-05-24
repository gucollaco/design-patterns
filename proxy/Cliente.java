package proxy;

public class Cliente {
	public static void main(String[] args) {
		Sujeito sujeito = Fabrica.getSujeito();
		String test = (String)sujeito.operacao();
		System.out.println(test);
		Sujeito suj = new Intermediario();
		test = (String)suj.operacao();
		System.out.println(test);
	}
}
