package facade;

public class Carrinho {
	Produto p[] = new Produto[50];
	int i = 0;
	public static Carrinho create() {
		return new Carrinho();
	}
	
	public void adicionar(Produto p) {
		this.p[i] = p;
		i++;
	}
	
	public double getTotal() {
		double soma = 0;
		int j;
		for(j = 0; j < i; j++) {
			soma += p[j].getPreco();
		}
		return soma;
	}
}
