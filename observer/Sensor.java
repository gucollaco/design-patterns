package observer;

import java.util.ArrayList;
import java.util.Iterator;


public class Sensor {
	private ArrayList<Observador> Observadors = new ArrayList<Observador>();
	
	public void add(Observador o) {
		Observadors.add(o);
	}
	public void remove(Observador o) {
		Observadors.remove(o);
	}
	public void notifica() {
		Iterator<Observador> it = Observadors.iterator();
		while(it.hasNext()) {
			Observador o = it.next();
			o.atualiza(this);
		}
	}
}
