package factory;

import model.leaf.Leaf;
import model.milk.Milk;

public abstract class BeverageAbstractFactory {
	public abstract Leaf createLeaf();

	public abstract Milk createMilk();
}
