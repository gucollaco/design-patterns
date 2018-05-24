package composite_congress;

import java.util.ArrayList;

public class Instituicao extends Individuo {
	
	private ArrayList<Individuo> participantes = new ArrayList<Individuo>();
	
	public void adicionaParticipante(Individuo novo) {
		participantes.add(novo);
	}
	
	public int getMembros(){
		return participantes.size();
	}
	
}
