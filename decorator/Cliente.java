package decorator;

public class Cliente {
	public static void main(String args[]) {
		Texto t1 = new TextoSimples();
		Texto t2 = new Invertido(t1);
		Texto t3 = new CaixaAlta(t1);
		Texto t4 = new CercadoTags(t1);
		Texto t5 = new Invertido(t4);
		Texto t6 = new CercadoTags(t2);
		
		t1.setTexto("texto teste");
		
		System.out.println(t1.getTexto());
		System.out.println(t2.getTexto());
		System.out.println(t3.getTexto());
		System.out.println(t4.getTexto());
		System.out.println(t5.getTexto());
		System.out.println(t6.getTexto());
	}
}
