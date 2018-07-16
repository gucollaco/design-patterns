package decorator;

public abstract class Decorador implements Texto {
	private Texto t;
	
	public Decorador(Texto t) {
		this.t = t;
	}
	
	public String getTexto() {
		return t.getTexto();
	}

	public void setTexto(String texto) {
		t.setTexto(texto);
	}
}
