package prototype;

public interface Circulo extends Cloneable {
	public Ponto getP();
	public void setP(Ponto p);
	public int getRaio();
	public void setRaio(int raio);
	public Object clone();
}
