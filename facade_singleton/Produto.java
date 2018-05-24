package facade_singleton;

public class Produto {
	private String nome;
	private int id;
	private double preco;
	
	public static Produto create(String nome, int id, double preco) {
		Produto p = new Produto();
		p.setNome(nome);
		p.setId(id);
		p.preco = preco;
		return p;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
