package iterator;

import java.util.Collection;
import java.util.Iterator;

public class FiguraIterator {
	private Iterator<Figura> i;
	
	public FiguraIterator(Collection<Figura> Figuras){
		i = Figuras.iterator();
	}
	
	public boolean hasNext() {
		return i.hasNext();
	}
	
	public Figura next() {
		return i.next();
	}
}
