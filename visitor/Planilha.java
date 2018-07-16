package visitor;

public class Planilha implements Documento {
	private String dados;
	
	public Planilha(String dados) {
		setDados(dados);
	}
	
	public String getDados() {
		return dados;
	}
	
	public void setDados(String dados) {
		this.dados = dados;
	}
	
	public Object aceitar(Visitante v) {
		return v.visitar(this);
	}
	
	public void gerarHTML() {
		dados = "<html>"+ dados + "<html>";
	}
	
	public void gerarXML() {
		dados = "<xml>"+ dados + "<xml>";
	}
	
	public void gerarTexto() {
		
	}
	
	public String toString() {
		return "Planilha: " + dados;
	}
}
