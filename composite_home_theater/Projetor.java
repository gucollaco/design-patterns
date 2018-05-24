package composite_home_theater;

public class Projetor extends Dispositivo {
	
	public Projetor(int id) {
		super(id);
	}
	
	public int getQtdDisp() {
		return 1;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}
