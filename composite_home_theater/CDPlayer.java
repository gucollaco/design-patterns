package composite_home_theater;

public class CDPlayer extends Dispositivo {
	
	public CDPlayer(int id) {
		super(id);
	}
	
	public int getQtdDisp() {
		return 1;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}
