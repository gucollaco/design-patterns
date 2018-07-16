package prototype;

public class RetanguloConcreto implements Retangulo{
	private Ponto p1, p2;
	
	public RetanguloConcreto(Ponto p1, Ponto p2){
		this.setP1(p1);
		this.setP2(p2);
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
	public String toString() {
		return "Retangulo(" + getP1() + ", " + getP2() + ")"; 
	}
	public Object clone() {
		try {
			Retangulo r = (Retangulo)super.clone();
			r.setP1((Ponto) p1.clone());
			r.setP2((Ponto) p2.clone());
			return r;
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
}
