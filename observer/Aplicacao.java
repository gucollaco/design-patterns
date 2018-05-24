package observer;

public class Aplicacao {
	public static void main(String[] args) {
		ObservadorConcreto ANA = new ObservadorConcreto(1);
		ObservadorConcreto INPE = new ObservadorConcreto(2);
		ObservadorConcreto UFPE = new ObservadorConcreto(3);
		ObservadorConcreto UFRGS = new ObservadorConcreto(4);
		SensorConcreto s1 = new SensorConcreto(1);
		SensorConcreto s2 = new SensorConcreto(2);
		SensorConcreto s3 = new SensorConcreto(3);
		SensorConcreto s4 = new SensorConcreto(4);
		SensorConcreto s5 = new SensorConcreto(5);
		s1.add(ANA);
		s1.add(INPE);
		s2.add(ANA);
		s2.add(UFPE);
		s2.add(UFRGS);
		s3.add(ANA);
		s4.add(INPE);
		s4.add(UFPE);
		s5.add(UFRGS);
		s5.add(INPE);
		s1.setTemperatura(30.2);
		s2.setTemperatura(45.2);
		s3.setTemperatura(20.3);
		s4.setPh(7.5);
		s5.setPh(14);
		s5.remove(INPE);
		s5.setTemperatura(27.4);
	}
}
