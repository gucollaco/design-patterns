package factory;

public class Quadrado implements Figura {
	
	private double lado;
	
	@Override
	public double area() {
		return lado * lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
