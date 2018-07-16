package command;

import java.util.Scanner;

public class Cliente {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		int i = 0;
		Server servidor = new Server();
		Pessoa pessoa = null;
		Scanner input;
		String cmd, linha, vetor[];
		servidor.initCommands();
		input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite:");
			linha = input.nextLine();
			vetor = linha.split(" ");
			cmd = vetor[0];
			
			if(vetor.length >= 2) {
				i = Integer.parseInt(vetor[1]);
			}
			
			if(vetor.length == 3) {
				pessoa = new Pessoa();
				pessoa.setId(i);
				pessoa.setNome(vetor[2]);				
			}
			
			switch(cmd.toLowerCase()) {
				case "all":
					servidor.service(cmd, null);
					break;
				case "new":
					servidor.service(cmd, pessoa);
					break;
				case "delete":
					servidor.service(cmd, i);
					break;
				case "get":
					servidor.service(cmd, i);
				default:
					System.out.println("commando invalido");
			}
		}
	}
}
