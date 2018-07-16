package visitor;

public class GerarXML implements Visitante {
	@Override
	public Object visitar(Planilha p) {
		System.out.println("Planilha: gerando xml...");
		p.gerarXML();
		return null;
	}

	@Override
	public Object visitar(Texto t) {
		System.out.println("Texto: gerando xml...");
		t.gerarXML();
		return null;
	}

	@Override
	public Object visitar(Grafico g) {
		System.out.println("Grafico: gerando xml...");
		g.gerarXML();
		return null;
	}
}
