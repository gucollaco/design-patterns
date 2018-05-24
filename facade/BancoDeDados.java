package facade;

public class BancoDeDados {
	private Cliente[] c = new Cliente[50];
	private Produto[] p = new Produto[50];
	private int nc = 0;
	private int np = 0;
	
	public Cliente selectCliente(int id) {
		int i;
		for(i = 0; i < nc; i++) {
			if(c[i].getId() == id)
				return c[i];
		}
		return null;
	}
	
	public Produto selectProduto(int id) {
		int i;
		for(i = 0; i < np; i++) {
			if(p[i].getId() == id)
				return p[i];
		}
		return null;
	}
	
	public void ProcessaPagamento(Cliente c, double v){
		System.out.print("Processado.\nCliente:" + c.getNome() + "\nPreco:" + v);
	}
	
	public void addCliente(Cliente c) {
		if(nc < 50) {
			this.c[nc] = c;
			nc++;
		}
	}
	
	public void addProduto(Produto p) {
		if(np < 50) {
			this.p[np] = p;
			np++;
		}
		
	}
}
