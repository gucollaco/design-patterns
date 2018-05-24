package bridge_queue;

public abstract class Queue {
	protected Implementador imp;
	
	public Queue(Implementador list) {
		imp = list;
	}
	
	public abstract Object dequeue();
	
	public abstract void enqueue(Object o);
	
	public abstract boolean isEmpty();
	
	public abstract int size();
}
