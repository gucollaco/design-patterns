package memento;

public class Value {
	protected int value;
    private ValueCareTaker careTaker;
    
    public Value() {
    	this.careTaker = new ValueCareTaker();
    	this.value = 1;
    }
    
    public void multValue(int newValue) {
    	careTaker.addMemento(new ValueMemento(value));
        value = value * newValue;
    }
    
    public void undoMultValue() {
        value = careTaker.getLastSavedValue().getSavedValue();
    }
    
    public void showValue() {
        System.out.println(value);
    }
}
