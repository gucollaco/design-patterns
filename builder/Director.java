package builder;

public class Director {
	
	protected Builder build;
	
	public Director(Builder build) {
		this.build = build;
	}
	
	public void construir(String nome, String identidade, String nomeEmpresa) {
		BancoDeDados banco = BancoDeDados.getInstancia();
		if(!banco.verifExistencia(nome, identidade)) {
			build.buildNome(nome);
			build.buildIdentidade(identidade);
			build.buildNomeEmpresa(nomeEmpresa);
		} else {
			build.info.nome = nome;
			build.info.identidade = identidade;
			if(build instanceof EmpresaBuilder) {
				build.info.nomeEmpresa = nomeEmpresa;
			} else {
				build.info.nomeEmpresa = "";
			}
		}
	}
	
	public Info getInfo() {
		return build.info;
	}
}
