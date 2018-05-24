package bridge_queue;

public interface Implementador {
	public Object dequeue();
	public void enqueue(Object o);
	public boolean isEmpty();
	public int size();
}
