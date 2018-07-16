package prototype;

public interface FabricaDeFormas {
	public Ponto constroiPonto(int x, int y);
	public Ponto constroiPonto(Ponto p);
	public Circulo constroiCirculo(Ponto p, int raio);
	public Circulo constroiCirculo(Circulo c);
	public Retangulo constroiRetangulo(Ponto p1, Ponto p2);
	public Retangulo constroiRetangulo(Retangulo r);
	public Triangulo constroiTriangulo(Ponto p1, Ponto p2, Ponto p3);
	public Triangulo constroiTriangulo(Triangulo t);
}
