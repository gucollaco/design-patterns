package factory;

public class TriEquilatero implements Figura {

	private double lado;
	
	@Override
	public double area() {
		return ((lado * lado) / 4) * Math.sqrt(3);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
