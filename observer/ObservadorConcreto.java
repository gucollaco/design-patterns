package observer;

public class ObservadorConcreto implements Observador {
	private int id;
	
	public ObservadorConcreto(int id) {
		this.id = id;
	}
	public void atualiza(Sensor o) {
		SensorConcreto sc = (SensorConcreto) o;
		System.out.println("Observador id "+ this.getId() + ", Sensor id " + sc.getId());
		System.out.println("Temperatura: " + sc.getTemperatura());
		System.out.println("Ph: " +sc.getPh());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
