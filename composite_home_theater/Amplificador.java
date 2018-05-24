package composite_home_theater;

public class Amplificador extends Dispositivo {
	
	public Amplificador(int id) {
		super(id);
	}
	
	public int getQtdDisp() {
		return 1;
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}
