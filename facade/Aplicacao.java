package facade;

public class Aplicacao {
	public static void main(String[] args) {
		Facade f = new Facade();
		f.registrarProduto("racao", 223, 20.50);
		f.registrarProduto("peixe", 342, 34.95);
		f.registrar("ZÉ", 123);
		f.comprar(223, 123);
		f.comprar(342, 123);
		f.fecharCompra(123);
	}
}
