package composite_congress;

import java.util.ArrayList;

public class Congresso {
	
	private int acentos;
	private ArrayList<Individuo> participantes = new ArrayList<Individuo>();
	
	public void setAcentos(int ac) {
		acentos = ac;
	}
	
	public void adicionaIndividuo(Individuo i) {
		participantes.add(i);
	}
	
	public int totalParticipantes() {
		int total = 0, i;
		for(i = 0; i < participantes.size(); i++) {
			Individuo x = participantes.get(i);
			total += x.getMembros();
		}
		return total;
	}
	
	public int totalAcentos() {
		return acentos;
	}
	
}
