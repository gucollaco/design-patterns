package composite_home_theater;

public class Main {
	
	public static void main(String[] args) {
		
		Dispositivo amplificador = new Amplificador(1);
		Dispositivo cd = new CDPlayer(2);
		Dispositivo dvd = new DVDPlayer(3);
		
		HomeTheater homeTheater = new HomeTheater(5);
		homeTheater.add(amplificador);
		homeTheater.add(cd);
		homeTheater.add(dvd);
		
		System.out.println(homeTheater.getQtdDisp());

		//cd removido do hometheater
		homeTheater.remove(cd);
		System.out.println(homeTheater.getQtdDisp());

		//funcao toString de um amplificador
		System.out.println(amplificador.toString());
		
		//cada dispositivo ligado independentemente
		amplificador.desligar();
		dvd.ligar();
		System.out.println(amplificador.getEstado());
		System.out.println(dvd.getEstado());
		System.out.println(homeTheater.getEstado());

		//tudo do hometheater será desligado
		homeTheater.desligar();
		System.out.println(amplificador.getEstado());
		System.out.println(dvd.getEstado());
		System.out.println(homeTheater.getEstado());

		//tudo do hometheater será ligado
		homeTheater.ligar();
		System.out.println(amplificador.getEstado());
		System.out.println(dvd.getEstado());
		System.out.println(homeTheater.getEstado());
		
	}
	
}
