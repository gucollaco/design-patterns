package composite_machine;

import java.util.*;

public class MachineComposite extends MachineComponent {
	protected List<MachineComponent> components = new ArrayList<MachineComponent>();
	public void add(MachineComponent component) {
		components.add(component);
	}
	public int getMachineCount() {
		int count = 0;
		for(int i = 0; i < components.size(); i++) {
			count += components.get(i).getMachineCount();
		}
		return count;
	}
}
