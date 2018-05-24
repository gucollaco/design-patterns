package adapter_enumeration_iterator;

import java.util.Enumeration;

public class Adapter implements Enumeration<Object> {
	private int size = 0;
	private int pos = 0;
	private ClasseUtil cs;

	public boolean hasMoreElements() {
		cs = new ClasseUtil(this.pos, this.size);
		return cs.hasNext();
	}
	
	public Object nextElement() {
		cs = new ClasseUtil(this.pos, this.size);

		int atual = (int) cs.next();
		pos = atual + 1;
		
		return atual;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
}
