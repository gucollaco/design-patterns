package composite;

public class Artigo implements Publicacao{
	private String nome, autores[];
	public Artigo(String nome, String autores[]){
		this.nome = nome;
		this.autores = autores;
	}
	public String toString(){
		String text = "";
		text += this.nome;
		int i;
		text += "[ ";
		for(i = 0; i < autores.length; i++) {			
			text += autores[i] + " ";
		}
		text += "]";
		return text + " ";
	}
	public String getNome(){
		return nome;
	}
}
