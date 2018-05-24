package builder;

public abstract class Builder {

	protected Info info;
	
	public Builder() {
		info = new Info();
	}
	
	public abstract void buildNome(String nome);
	
	public abstract void buildIdentidade(String identidade);
	
	public abstract void buildNomeEmpresa(String nomeEmpresa);

}
