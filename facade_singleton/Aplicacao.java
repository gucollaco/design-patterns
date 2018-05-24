package facade_singleton;

public class Aplicacao {
	public static void main(String[] args) {
		Facade f = Facade.getInstancia();
		Facade f2 = Facade.getInstancia();
		Facade f3 = Facade.getInstancia();
		
		f.registrarProduto("racao", 223, 20.50);
		f.registrarProduto("peixe", 342, 34.95);
		f.registrar("ZÉ", 123);
		f.comprar(223, 123);
		f.comprar(342, 123);
		f.fecharCompra(123);

		f2.comprar(342, 123);
		f2.fecharCompra(123);
		
		f3.fecharCompra(123);
	}
}
