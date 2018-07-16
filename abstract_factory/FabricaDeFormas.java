package abstract_factory;

public interface FabricaDeFormas {
	public Ponto constroiPonto(int x, int y);
	public Circulo constroiCirculo(Ponto p, int raio);
	public Retangulo constroiRetangulo(Ponto p1, Ponto p2);
	public Triangulo constroiTriangulo(Ponto p1, Ponto p2, Ponto p3);
}
