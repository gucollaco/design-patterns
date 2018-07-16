package prototype;

public class Cliente {
	public static void main(String[] args) {
		FabricaDeFormas FF = FabricaFormas.getInstancia();
		Ponto p1, p2, p3, p4, p5, pClone;
		Circulo c1, cClone;
		Retangulo r1, rClone;
		Triangulo t1, tClone;
		p1 = FF.constroiPonto(1,1);
		p2 = FF.constroiPonto(3,4);
		p3 = FF.constroiPonto(5,8);
		p4 = FF.constroiPonto(9,6);
	    p5 = FF.constroiPonto(7,6);
	    c1 = FF.constroiCirculo(p1, 5);
	    r1 = FF.constroiRetangulo(p2, p4);
	    t1 = FF.constroiTriangulo(p3, p1, p5);
	    pClone = FF.constroiPonto(p1);
	    cClone = FF.constroiCirculo(c1);
	    rClone = FF.constroiRetangulo(r1);
	    tClone = FF.constroiTriangulo(t1);
	    System.out.println("Objetos:");
	    System.out.println(p1 + " \t\t\t\t\t\t hash " + p1.hashCode());
	    System.out.println(p2 + " \t\t\t\t\t\t hash " + p2.hashCode());
	    System.out.println(c1 + " \t\t\t\t hash " + c1.hashCode());
	    System.out.println(r1 + " \t\t\t hash " + r1.hashCode());
	    System.out.println(t1 + " \t hash " + t1.hashCode());
	    System.out.println("Clones:");
	    System.out.println(pClone + " \t\t\t\t\t\t hash " + pClone.hashCode());
	    System.out.println(cClone + " \t\t\t\t hash " + cClone.hashCode());
	    System.out.println(rClone + " \t\t\t hash " + rClone.hashCode());
	    System.out.println(tClone + " \t hash " + tClone.hashCode());
	    
	}
}
