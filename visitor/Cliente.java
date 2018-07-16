package visitor;

public class Cliente {
	public static void main(String[] args) {
		Documento doc1 = new Texto("texto exemplo");
		Documento doc2 = new Grafico("gráfico exemplo");
		Documento doc3 = new Texto("planilha exemplo");
		
		doc1.aceitar(new GerarTexto());
		doc2.aceitar(new GerarHTML());
		doc3.aceitar(new GerarXML());
		
		if (((Boolean)doc1.aceitar(new Validar())).booleanValue()) {
			System.out.println(doc1 + " válido!");
		}
		if (((Boolean)doc2.aceitar(new Validar())).booleanValue()) {
			System.out.println(doc2 + " válido!");
		}
		if (((Boolean)doc3.aceitar(new Validar())).booleanValue()) {
			System.out.println(doc3 + " válido!");
		}
	}
}
