package facade;

public class Cliente {
	private int id;
	private int i = 0;
	private String nome;
	private Carrinho[] carrinho = new Carrinho[50];
	
	public static Cliente create(String nome, int id) {
		Cliente c = new Cliente();
		c.setId(id);
		c.setNome(nome); 
		return c;
	}
	
	public void adicionarCarrinho(Carrinho c) {
		if(i < 50) {
			carrinho[i] = c;
			i++;
		}
	}
	
	public Carrinho getCarrinho() {
		return i >= 1 ? carrinho[i-1] : carrinho[0];
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
