package flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	
	public HashMap<Integer, AlgarismoFlyweight> algarismos;
	
	public FlyweightFactory() {
		algarismos = new HashMap<Integer, AlgarismoFlyweight>();
	}
	
	public AlgarismoFlyweight getFlyweight(int id) {
		if(algarismos.containsKey(id)) {
			return algarismos.get(id);
		} else {
			AlgarismoFlyweight algarismo = new Algarismo(id);
			algarismos.put(id, algarismo);
			return algarismo;
		}
	}
	
	public void addAlgarismo(int id) {
		if(!algarismos.containsKey(id)) {
			AlgarismoFlyweight algarismo = new Algarismo(id);
			algarismos.put(id, algarismo);
		}
	}

}
