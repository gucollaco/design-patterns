package adapter_enumeration_iterator;

import java.util.Iterator;

public class ClasseUtil implements Iterator<Object> {
	private int pos;
	private int fim;
	
	public ClasseUtil(int pos, int fim) {
		this.pos = pos;
		this.fim = fim;
	}
	
	public boolean hasNext() {
		return this.fim > this.pos;
	}
	
	public Object next() {
		if(this.hasNext()) {
			int atual = this.pos;
			this.pos++;
			return atual;
		}
		
		return null;
	}

}
