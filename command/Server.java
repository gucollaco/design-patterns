package command;

import java.util.HashMap;

public class Server {
	private HashMap<String, Command> cmds;
	private HashMap<Integer, Pessoa> db;
	
	public Server(){
		cmds = new HashMap<String, Command>();
		db = new HashMap<Integer, Pessoa>();
	}
	public void initCommands() {
		cmds.put("all", new All(db));
		cmds.put("new", new New(db));
		cmds.put("get", new Get(db));
		cmds.put("delete", new Delete(db));
	}
	public void service(String cmd, Object data) {
		Command c = cmds.get(cmd);
		if(c != null) {
			Object result = c.execute(data);			
			System.out.println(result);
		}
		else {
			System.out.println("Erro comando invalido");
		}
	}
}
