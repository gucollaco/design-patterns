package observer;

public class SensorConcreto extends Sensor{
	private double temperatura;
	private double ph;
	private int id;
	
	public SensorConcreto(int id) {
		setId(id);
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
		notifica();
	}
	public double getPh() {
		return ph;
	}
	public void setPh(double ph) {
		this.ph = ph;
		notifica();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
