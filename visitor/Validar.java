package visitor;

public class Validar implements Visitante {

	@Override
	public Object visitar(Planilha p) {
		return new Boolean(true);
	}

	@Override
	public Object visitar(Texto t) {
		return new Boolean(true);
	}

	@Override
	public Object visitar(Grafico g) {
		return new Boolean(true);
	}

}
