package composite_home_theater;

public class MaqRefri extends Dispositivo {
	
	public MaqRefri(int id) {
		super(id);
	}
	
	public int getQtdDisp() {
		return 1;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}
