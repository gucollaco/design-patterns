package chain_of_responsibility;

import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		//scanner instanciado
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira uma frase: ");
		String input = scanner.nextLine();
		
		scanner.close();
		
		ProcessadorPontos pontos = new ProcessadorPontos();
		ProcessadorLetrasA letrasA = new ProcessadorLetrasA();
		ProcessadorEspacos espacos = new ProcessadorEspacos();
		
		pontos.setSucessor(letrasA);
		letrasA.setSucessor(espacos);
		
		//partindo do pontos (início da 'hirarquia' -> todos os valores)
		System.out.println(pontos.analisarInput(input));

		//partindo do letrasA (meio da 'hierarquia' -> 2 valores)
		System.out.println(letrasA.analisarInput(input));

		//partindo do espacos (fim da 'hirarquia' -> 1 valor)
		System.out.println(espacos.analisarInput(input));
	}
}
