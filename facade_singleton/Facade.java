package facade_singleton;

public class Facade {
	private BancoDeDados b = new BancoDeDados();
	private static Facade facade;
	
	private Facade() {};
	
	public static Facade getInstancia() {
		if(facade == null) {
			facade = new Facade();
		}
		return facade;
	}
	
	public void registrar(String nome, int id) {
		Cliente c = Cliente.create(nome, id);
		Carrinho cc = Carrinho.create();
		c.adicionarCarrinho(cc);
		b.addCliente(c);
	}
	
	public void registrarProduto(String nome, int id, double preco) {
		Produto p = Produto.create(nome, id, preco);
		b.addProduto(p);
	}
	
	public void comprar(int pid, int cid) {
		Cliente c = b.selectCliente(cid);
		Produto p = b.selectProduto(pid);
		
		if(c != null && p != null) {
			c.getCarrinho().adicionar(p);
		}
	}
	
	public void fecharCompra(int cid){
		Cliente c = b.selectCliente(cid);
		if(c != null) {
			double v = c.getCarrinho().getTotal();
			b.ProcessaPagamento(c, v);
		}
	}
}
