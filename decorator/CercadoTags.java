package decorator;

public class CercadoTags extends Decorador {

	public CercadoTags(Texto t) {
		super(t);
	}
	
	public String getTexto() {
		return "<b>" + super.getTexto() + "</b>";
	}

}
