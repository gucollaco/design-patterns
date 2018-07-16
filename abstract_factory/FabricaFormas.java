package abstract_factory;

public class FabricaFormas implements FabricaDeFormas {
	
	private static FabricaFormas instancia = null;

	private FabricaFormas() {}

	public static FabricaFormas getInstancia() {
		if(instancia == null) {
			instancia = new FabricaFormas(); 
		}
	    return instancia;
	}
	
	@Override
	public Ponto constroiPonto(int x, int y) {
		return new PontoConcreto(x, y);
	}

	@Override
	public Circulo constroiCirculo(Ponto p, int raio) {
		Ponto ponto = constroiPonto(p.getX(), p.getY());
		return new CirculoConcreto(ponto, raio);
	}

	@Override
	public Retangulo constroiRetangulo(Ponto p1, Ponto p2) {
		Ponto ponto1 = constroiPonto(p1.getX(), p1.getY());
		Ponto ponto2 = constroiPonto(p2.getX(), p2.getY());
		return new RetanguloConcreto(ponto1, ponto2);
	}

	@Override
	public Triangulo constroiTriangulo(Ponto p1, Ponto p2, Ponto p3) {
		Ponto ponto1 = constroiPonto(p1.getX(), p1.getY());
		Ponto ponto2 = constroiPonto(p2.getX(), p2.getY());
		Ponto ponto3 = constroiPonto(p3.getX(), p3.getY());
		return new TrianguloConcreto(ponto1, ponto2, ponto3);
	}

}
