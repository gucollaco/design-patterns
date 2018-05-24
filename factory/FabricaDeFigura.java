package factory;

public class FabricaDeFigura {
	
	private static FabricaDeFigura facade;
	
	private FabricaDeFigura() {};
	
	public static FabricaDeFigura getInstancia() {
		if(facade == null) {
			facade = new FabricaDeFigura();
		}
		return facade;
	}

	public static Figura criarFigura(String forma, double lado, double raio) {
		switch(forma) {
			case "Quadrado":
				return criarQuadrado(lado);
			case "Circulo":
				return criarCirculo(raio);
			case "TrianguloEquilatero":
				return criarTriEquilatero(lado);
			default:
				break;
		}
		return null;
	}
	
	private static Circulo criarCirculo(double raio) {
		Circulo figura = new Circulo();
		figura.setRaio(raio);
		return figura;
	}
	
	private static Quadrado criarQuadrado(double lado) {
		Quadrado figura = new Quadrado();
		figura.setLado(lado);
		return figura;
	}

	private static TriEquilatero criarTriEquilatero(double lado) {
		TriEquilatero figura = new TriEquilatero();
		figura.setLado(lado);
		return figura;
	}

}
