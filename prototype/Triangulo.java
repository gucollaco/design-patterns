package prototype;

public interface Triangulo extends Cloneable{
	public Ponto getP1();
	public void setP1(Ponto p1);
	public Ponto getP2();
	public void setP2(Ponto p2);
	public Ponto getP3();
	public void setP3(Ponto p3);
	public Object clone();
}
