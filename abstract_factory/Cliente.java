package abstract_factory;

public class Cliente {
	public static void main(String[] args) {
		FabricaDeFormas FF = FabricaFormas.getInstancia();
		Ponto p1, p2, p3, p4, p5;
		Circulo c1;
		Retangulo r1;
		Triangulo t1;
		p1 = FF.constroiPonto(1,1);
		p2 = FF.constroiPonto(3,4);
		p3 = FF.constroiPonto(5,8);
		p4 = FF.constroiPonto(9,6);
	    p5 = FF.constroiPonto(7,6);
	    c1 = FF.constroiCirculo(p1, 5);
	    r1 = FF.constroiRetangulo(p2, p4);
	    t1 = FF.constroiTriangulo(p3, p1, p5);
	    System.out.println(p1);
	    System.out.println(p2);
	    System.out.println(c1);
	    System.out.println(r1);
	    System.out.println(t1);
	}
}
