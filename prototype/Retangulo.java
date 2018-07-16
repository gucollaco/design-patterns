package prototype;

public interface Retangulo extends Cloneable{
	public Ponto getP1();
	public void setP1(Ponto p1);
	public Ponto getP2();
	public void setP2(Ponto p2);
	public Object clone();
}
