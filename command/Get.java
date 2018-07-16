package command;

import java.util.HashMap;

public class Get  implements Command{
	private HashMap<Integer, Pessoa> db;
	
	public Get(HashMap<Integer, Pessoa> db){
		this.db = db;
	}
	
	public Object execute(Object arg) {
		int data = (int) arg;
		if(!db.containsKey(data)) {
			return "Erro: id nao esta no banco de dados";
		}
		Pessoa p = db.get(data);
		return p.getNome();
	}
}
