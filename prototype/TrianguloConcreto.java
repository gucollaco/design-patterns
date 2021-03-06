package prototype;

public class TrianguloConcreto implements Triangulo{
	private Ponto p1, p2, p3;
	
	public TrianguloConcreto(Ponto p1, Ponto p2, Ponto p3){
		this.setP1(p1);
		this.setP2(p2);
		this.setP3(p3);
	}
	public Ponto getP1() {
		return p1;
	}
	public void setP1(Ponto p1) {
		this.p1 = p1;
	}
	public Ponto getP2() {
		return p2;
	}
	public void setP2(Ponto p2) {
		this.p2 = p2;
	}
	public Ponto getP3() {
		return p3;
	}
	public void setP3(Ponto p3) {
		this.p3 = p3;
	}
	public String toString() {
		return "Triangulo(" + getP1() + ", " + getP2() + ", " + getP3() + ")"; 
	}
	public Object clone() {
		try {
			Triangulo t = (Triangulo)super.clone();
			t.setP1((Ponto) p1.clone());
			t.setP2((Ponto) p2.clone());
			t.setP3((Ponto) p3.clone());
			return t;
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
}
