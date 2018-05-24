package builder;

import java.util.HashMap;

public class BancoDeDados {
	
	private static HashMap<String, String> bancoDados;
	
	private static BancoDeDados banco;
	
	private BancoDeDados() {};
	
	public static BancoDeDados getInstancia() {
		if(banco == null) {
			bancoDados = new HashMap<String, String>();
			bancoDados.put("Pim", "1");
			bancoDados.put("Gustavo", "2");
			bancoDados.put("Eve", "3");
			bancoDados.put("Joseph", "4");
			bancoDados.put("Lieke", "5");
			banco = new BancoDeDados();
		}
		return banco;
	}
	
	public boolean verifExistencia(String nome, String identidade) {
		if(bancoDados.containsKey(nome)) {
			if(bancoDados.get(nome) == identidade) {
				return true;
			}
		}
		return false;
	}
	
}
