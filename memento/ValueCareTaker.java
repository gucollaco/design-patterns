package memento;

import java.util.ArrayList;

public class ValueCareTaker {
	protected ArrayList<ValueMemento> values;
	
	public ValueCareTaker() {
        values = new ArrayList<ValueMemento>();
    }
 
    public void addMemento(ValueMemento memento) {
        values.add(memento);
    }
 
    public ValueMemento getLastSavedValue() {
        if (values.size() <= 0) {
            return new ValueMemento(0);
        }
        ValueMemento savedValue = values.get(values.size() - 1);
        values.remove(values.size() - 1);
        return savedValue;
    }
}
