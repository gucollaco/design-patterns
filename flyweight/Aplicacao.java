package flyweight;

import java.util.Random;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		FlyweightFactory factory = new FlyweightFactory();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Número " + i + ": ");
			
			for(int j = 1; j <= 10; j++) {
				int randomValue = random.nextInt(10);
				
				Algarismo algarismo = (Algarismo) factory.getFlyweight(randomValue);
				algarismo.retornarValor();
				System.out.print(algarismo.toString());
			}
			
			System.out.println();
		}
	}
	
}
