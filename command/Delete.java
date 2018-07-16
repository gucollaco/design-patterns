package command;

import java.util.HashMap;

public class Delete  implements Command{
	private HashMap<Integer, Pessoa> db;
	
	public Delete(HashMap<Integer, Pessoa> db){
		this.db = db;
	}
	
	public Object execute(Object arg) {
		int data = (int) arg;
		if(!db.containsKey(data)) {
			return "Erro: id nao esta no banco de dados";
		}
		Pessoa p = db.remove(data);
		return "Pessoa Id: " + p.getId() + " Nome: " + p.getNome() + " removido";
	}
}
