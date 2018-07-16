package command;

import java.util.HashMap;

public class New implements Command{
	private HashMap<Integer, Pessoa> db;
	
	public New(HashMap<Integer, Pessoa> db){
		this.db = db;
	}
	
	public Object execute(Object arg) {
		Pessoa data = (Pessoa) arg;
		if(db.containsKey(data.getId())) {
			return "Erro: id ja esta no banco de dados";
		}
		db.put(data.getId(), data);
		return "Pessoa Id: " + data.getId() + " Nome: " + data.getNome() + " adicionada";
	}
}
