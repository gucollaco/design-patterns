package memento;

public class Application {
	
	public static void main(String[] args) {
		//value starts as 1
		Value val = new Value();
	    
	    val.multValue(2);
	    val.multValue(3);
	    val.multValue(5);
	    val.showValue();
	    
	    //third multiplication undone
	    val.undoMultValue();
	    val.showValue();
	    
	    //second multiplication undone
	    val.undoMultValue();
	    val.showValue();
	    
	    //first multiplication undone
	    val.undoMultValue();
	    val.showValue();
	}
}
