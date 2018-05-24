package chain_of_responsibility;

public class ProcessadorLetrasA implements Processador {
	private Processador sucessor;

	public ProcessadorLetrasA() {
		this.sucessor = null;
	}
	
	@Override
	public String analisarInput(String input) {
		int a = 0;
		char checkLowerA = 'a';
		char checkUpperA = 'A';
		
		for(char c : input.toCharArray()) {
			if(c == checkLowerA || c == checkUpperA) a++;
		}
		
		String strLetrasA = "-" + a + " letra(s) 'A' ou 'a'\n";
		
		if(sucessor != null) {
			return sucessor.analisarInput(input) + strLetrasA;
		} else {
			return strLetrasA;
		}
	}

	public Processador getSucessor() {
		return sucessor;
	}

	public void setSucessor(Processador sucessor) {
		this.sucessor = sucessor;
	}
}
