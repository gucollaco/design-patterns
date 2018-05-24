package builder;

public class Cliente {
	
	public static void main(String[] args) {
		
		Director dir = new Director(new PessoaBuilder());
		dir.construir("Gustavo", "2", "asd");
		Info informacoes = dir.getInfo();
		System.out.println("Nome: " + informacoes.nome 
				+ "\nId: " + informacoes.identidade
	            + "\nNome Empresa: " + informacoes.nomeEmpresa);
		
		System.out.println();
		
		dir = new Director(new PessoaBuilder());
		dir.construir("Gustavo", "2", "");
		informacoes = dir.getInfo();
		System.out.println("Nome: " + informacoes.nome 
				+ "\nId: " + informacoes.identidade
	            + "\nNome Empresa: " + informacoes.nomeEmpresa);
		
		System.out.println();
		
		dir = new Director(new EmpresaBuilder());
		dir.construir("NovoIndivíduo", "10", "DevFeliz");
		informacoes = dir.getInfo();
		System.out.println("Nome: " + informacoes.nome 
				+ "\nId: " + informacoes.identidade
	            + "\nNome Empresa: " + informacoes.nomeEmpresa);
		
	}

}
