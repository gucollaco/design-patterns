package composite_home_theater;

public class MaqPipoca extends Dispositivo {
	
	public MaqPipoca(int id) {
		super(id);
	}
	
	public int getQtdDisp() {
		return 1;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}
