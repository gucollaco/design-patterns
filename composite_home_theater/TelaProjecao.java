package composite_home_theater;

public class TelaProjecao extends Dispositivo {
	
	public TelaProjecao(int id) {
		super(id);
	}
	
	public int getQtdDisp() {
		return 1;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}
