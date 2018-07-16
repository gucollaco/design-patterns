package decorator;

public class Invertido extends Decorador {

	public Invertido(Texto t) {
		super(t);
	}
	
	public String getTexto() {
		String saida = "";
		String entrada = super.getTexto();
		for(int i = 0; i < entrada.length(); i++) {
			saida += entrada.charAt(entrada.length()-1-i);
		}
		return saida;
	}

}
