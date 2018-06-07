package factory;

public class Cliente {
	public static void main(String[] args) {
		Figura quadrado = FabricaDeFigura.criarFigura("Quadrado", 2.0);
		System.out.println(quadrado.area());
		System.out.println(quadrado.getClass().getName());
		System.out.println();
		
		Figura circulo = FabricaDeFigura.criarFigura("Circulo", 2.0);
		System.out.println(circulo.area());
		System.out.println(circulo.getClass().getName());
		System.out.println();

		Figura triequilatero = FabricaDeFigura.criarFigura("TrianguloEquilatero", 5.0);
		System.out.println(triequilatero.area());
		System.out.println(triequilatero.getClass().getName());
		System.out.println();
	}
}
