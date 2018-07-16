package iterator;

public class FiguraFactory {
	private static FiguraFactory inst;
	private FiguraFactory() {};
	
	public static FiguraFactory getInstancia() {
		if(inst == null) {
			inst = new FiguraFactory();
		}
		return inst;
	}

	public static Figura criarFigura(String nome, double dado) {
		if(nome.contentEquals("Quadrado") ) {
			return constroiQuadrado(dado);
		}
		if(nome.contentEquals("Circulo") ) {
			return 	constroiCirculo(dado);
		}
		if(nome.contentEquals("TrianguloEquilatero")) {
			return constroiTriangulo(dado,dado,dado);
		}
		return null;
	}
	
	private static Circulo constroiCirculo(double raio) {
		Circulo figura = new Circulo();
		figura.setRaio(raio);
		return figura;
	}
	
	private static Quadrado constroiQuadrado(double lado) {
		Quadrado figura = new Quadrado();
		figura.setLado(lado);
		return figura;
	}

	private static Triangulo constroiTriangulo(double lado1, double lado2, double lado3) {
		Triangulo figura = new Triangulo();
		figura.setL1(lado1);
		figura.setL2(lado2);
		figura.setL3(lado3);
		return figura;
	}

}
