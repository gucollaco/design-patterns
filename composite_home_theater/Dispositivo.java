package composite_home_theater;

public abstract class Dispositivo {
	
	private int id;
	private boolean estado;
	
	public abstract int getQtdDisp();
	
	public Dispositivo(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	protected void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void ligar() {
		this.setEstado(true);
	}
	public void desligar() {
		this.setEstado(false);
	}
	
}
