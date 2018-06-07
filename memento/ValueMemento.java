package memento;

public class ValueMemento {
	private int valueKept;
	
	public ValueMemento(int value) {
		this.valueKept = value;
	}
	
	public int getSavedValue() {
		return this.valueKept;
	}
}
