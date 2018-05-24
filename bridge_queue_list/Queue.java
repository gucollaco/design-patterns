package bridge_queue_list;

import java.util.List;

public abstract class Queue {
	protected List<Object> imp;
	
	public Queue(List<Object> list) {
		imp = list;
	}
	
	public abstract Object dequeue();
	
	public abstract void enqueue(Object o);
	
	public abstract boolean isEmpty();
	
	public abstract int size();
}
