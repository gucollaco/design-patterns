package decorator;

public class CaixaAlta extends Decorador {

	public CaixaAlta(Texto t) {
		super(t);
	}
	
	public String getTexto() {
		return super.getTexto().toUpperCase();
	}

}
