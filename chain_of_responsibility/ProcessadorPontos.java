package chain_of_responsibility;

public class ProcessadorPontos implements Processador {
	private Processador sucessor;
	
	public ProcessadorPontos() {
		this.sucessor = null;
	};
	
	@Override
	public String analisarInput(String input) {
		int dots = 0;
		
		for(char c : input.toCharArray()) {
			if(c == '.') dots++;
		}
		
		String strPontos = "-" + dots + " ponto(s)\n";
		
		if(sucessor != null) {
			return sucessor.analisarInput(input) + strPontos;
		} else {
			return strPontos;
		}
	}

	public Processador getSucessor() {
		return sucessor;
	}

	public void setSucessor(Processador sucessor) {
		this.sucessor = sucessor;
	}
}
