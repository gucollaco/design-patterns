package bridge_queue;

import java.util.Vector;

public class VectorQueue implements Implementador {
	private Vector<Object> vector = new Vector<Object>();
	
	@Override
	public Object dequeue() {
		return vector.remove(0);
	}

	@Override
	public void enqueue(Object o) {
		vector.add(o);		
	}

	@Override
	public boolean isEmpty() {
		return vector.isEmpty();
	}

	@Override
	public int size() {
		return vector.size();
	}	
}
