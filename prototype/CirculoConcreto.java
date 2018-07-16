package prototype;

public class CirculoConcreto implements Circulo{
	private Ponto p;
	private int raio;
	
	public CirculoConcreto(Ponto p, int raio){
		this.setP(p);
		this.setRaio(raio);
	}
	public Ponto getP() {
		return p;
	}
	public void setP(Ponto p) {
		this.p = p;
	}
	public int getRaio() {
		return this.raio;
	}
	public void setRaio(int raio) {
		this.raio = raio;
	}
	public String toString() {
		return "Circulo(" + getP() + ", " + getRaio() + ")"; 
	}
	public Object clone() {
		try {
			Circulo c = (Circulo)super.clone();
			c.setP((Ponto) p.clone());
			return c;
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
}
