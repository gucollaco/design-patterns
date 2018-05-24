package composite_home_theater;

public class Sintonizador extends Dispositivo {
	
	public Sintonizador(int id) {
		super(id);
	}
	
	public int getQtdDisp() {
		return 1;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}
