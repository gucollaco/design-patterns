package iterator;

public class Circulo implements Figura {
	private double raio;
	private double pi = 3.14;
	
	public double area() {
		return pi * raio * raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
