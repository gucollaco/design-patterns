package iterator;

import java.util.ArrayList;

public class Cliente {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(FiguraFactory.criarFigura("Quadrado", 2.0));
		figuras.add(FiguraFactory.criarFigura("Circulo", 2.0));
		figuras.add(FiguraFactory.criarFigura("TrianguloEquilatero", 1.0));
		FiguraIterator fi = new FiguraIterator(figuras);
		Figura f;
		
		while(fi.hasNext()) {
			f = fi.next();
			System.out.println(f.area());
			System.out.println(f.getClass().getName());			
		}
	}
}
