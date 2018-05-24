package adapter_enumeration_iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			intList.add(i+2);
			
		}
		
		Adapter adapter = new Adapter();
		adapter.setSize(intList.size());
		while(adapter.hasMoreElements()) {
			System.out.println(intList.get((int) adapter.nextElement()));
		}
	}
}