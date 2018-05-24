package bridge_queue;

public class FIFOQueue extends Queue {
	public FIFOQueue(Implementador list) {
		super(list);
	}
	
	public Object dequeue() {
		return imp.dequeue();
	}
	
	public void enqueue(Object o) {
		imp.enqueue(o);
	}
	
	public boolean isEmpty() {
		return imp.isEmpty();
	}
	
	public int size() {
		return imp.size();
	}
}
