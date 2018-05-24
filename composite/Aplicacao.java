package composite;

public class Aplicacao {
	public static void main(String[] args) {
		String[] alt = {"jose", "maria"};
		Colecao p1 = new Jornal("dia");
		Publicacao p2 = new Artigo("art11",alt);
		Colecao p3 = new Revista("cara");
		Colecao p4 = new Caderno("suco de fruta");
		Publicacao p5 = new Artigo("art12",alt);
		Publicacao p6 = new Artigo("art13",alt);
		p1.addPublicacao(p2);
		p1.addPublicacao(p4);
		p4.addPublicacao(p5);
		p4.addPublicacao(p3);
		p3.addPublicacao(p6);
		System.out.println(p1);
	}
}
