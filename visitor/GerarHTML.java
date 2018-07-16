package visitor;

public class GerarHTML implements Visitante {

	@Override
	public Object visitar(Planilha p) {
		p.gerarHTML();
		return null;
	}

	@Override
	public Object visitar(Texto t) {
		t.gerarHTML();
		return null;
	}

	@Override
	public Object visitar(Grafico g) {
		g.gerarHTML();
		return null;
	}

}
