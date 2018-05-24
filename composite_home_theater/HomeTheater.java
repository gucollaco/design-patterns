package composite_home_theater;

import java.util.ArrayList;
import java.util.List;

public class HomeTheater extends Dispositivo {
	
	private List<Dispositivo> composicao = new ArrayList<Dispositivo>();
	
	public HomeTheater(int id) {
		super(id);
	}
		
	public void add(Dispositivo d) {
		composicao.add(d);
	}
	
	public void remove(Dispositivo d) {
		if(!composicao.isEmpty()) {
			composicao.remove(d);
		}
	}
	
	public int getQtdDisp() {
		int qtdTotal = 0;
		
		for(int i = 0; i < composicao.size(); i++) {
			qtdTotal += composicao.get(i).getQtdDisp();
		}
		
		return qtdTotal;
	}
	
	public void ligar() {
		for(Dispositivo disp : composicao) {
			disp.ligar();
		}
		this.setEstado(true);
	}
	
	public void desligar() {
		for(Dispositivo disp : composicao) {
			disp.desligar();
		}
		this.setEstado(false);
	}
	
}
