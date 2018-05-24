package chain_of_responsibility;

public class ProcessadorEspacos implements Processador {
	private Processador sucessor;
	
	public ProcessadorEspacos() {
		this.sucessor = null;
	}
	
	@Override
	public String analisarInput(String input) {
		int spaces = 0;
		
		for(char c : input.toCharArray()) {
			if(c == ' ') spaces++;
		}
		
		String strSpaces = "-" + spaces + " espaço(s)\n";
		
		if(sucessor != null) {
			return sucessor.analisarInput(input) + strSpaces;
		} else {
			return strSpaces;
		}
	}

	public Processador getSucessor() {
		return sucessor;
	}

	public void setSucessor(Processador sucessor) {
		this.sucessor = sucessor;
	}
}
