package iterator;

import java.util.ArrayList;

import component.IComponent;

public class ComponentIterator implements Iterator {

	private ArrayList<IComponent> components;

	private int index;

	public ComponentIterator(ArrayList<IComponent> components) {
		super();
		this.components = components;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < components.size()) {
			return true;
		}
		return false;
	}

	@Override
	public IComponent getNext() {
		if (hasNext()) {
			return components.get(index++);
		}
		return null;
	}

}
