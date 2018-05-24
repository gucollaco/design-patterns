package bridge_queue;

import java.util.ArrayList;

public class ArrayListQueue implements Implementador {
	private ArrayList<Object> arrlist = new ArrayList<Object>();
	
	@Override
	public Object dequeue() {
		return arrlist.remove(0);
	}

	@Override
	public void enqueue(Object o) {
		arrlist.add(o);		
	}

	@Override
	public boolean isEmpty() {
		return arrlist.isEmpty();
	}

	@Override
	public int size() {
		return arrlist.size();
	}	
}
