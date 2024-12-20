package iterator;

import component.IComponent;

public interface Iterator {
	public boolean hasNext();

	public IComponent getNext();
}
