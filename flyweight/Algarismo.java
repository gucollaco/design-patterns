package flyweight;

public class Algarismo implements AlgarismoFlyweight {
	
	private int valor;
	
	public Algarismo(int valor) {
		this.setValor(valor);
	}
	
	public void retornarValor() {
		System.out.print(" " + this.getValor() + " ");
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
