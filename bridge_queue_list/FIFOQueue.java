package bridge_queue_list;

import java.util.List;

public class FIFOQueue extends Queue {
	public FIFOQueue(List<Object> list) {
		super(list);
	}
	
	public Object dequeue() {
		
		return imp.remove(0);
	}
	
	public void enqueue(Object o) {
		imp.add(o);
	}
	
	public boolean isEmpty() {
		return imp.isEmpty();
	}
	
	public int size() {
		return imp.size();
	}
}
