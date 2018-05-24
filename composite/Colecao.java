package composite;

import java.util.ArrayList;
import java.util.List;

public class Colecao implements Publicacao {
	private String nome;
	private List<Publicacao> publicacoes = new ArrayList<Publicacao>();
	public Colecao(String nome) {
		this.nome = nome;
	}
	public List<Publicacao> getPublicacoes(){
		return publicacoes;
	}
	public void addPublicacao(Publicacao p){
		publicacoes.add(p);
	}
	public String toString(){
		String text = getNome() + "\n";
		//Publicacao x;
		for(int i = 0; i < publicacoes.size(); i++) {
			//x = publicacoes.get(i);
			text += publicacoes.get(i).toString();
		}
		return text;
	}
	public String getNome() {
		return nome;
	}
}
