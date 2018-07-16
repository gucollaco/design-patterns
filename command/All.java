package command;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;



public class All implements Command {
	private HashMap<Integer, Pessoa> db;
	
	public All(HashMap<Integer, Pessoa> db){
		this.db = db;
	}
	
	public Object execute(Object arg) {
		Collection<Pessoa> c = db.values();
		Iterator<Pessoa> i;
		Pessoa p;
		String res = "";
		for(i = c.iterator(); i.hasNext();) {
			p = i.next();
			res += p.getNome() + "\n";
		}
		return res;
	}
	
}
