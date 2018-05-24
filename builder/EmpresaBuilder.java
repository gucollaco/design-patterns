package builder;

public class EmpresaBuilder extends Builder {
	
	@Override
	public void buildNome(String nome) {
		info.nome = nome;
	}

	@Override
	public void buildIdentidade(String identidade) {
		info.identidade = identidade;
	}

	@Override
	public void buildNomeEmpresa(String nomeEmpresa) {
		info.nomeEmpresa = nomeEmpresa;
	}

}
