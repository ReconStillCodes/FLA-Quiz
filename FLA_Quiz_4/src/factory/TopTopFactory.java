package factory;

import model.leaf.GreenLeaf;
import model.leaf.Leaf;
import model.milk.Milk;
import model.milk.SoyMilk;

public class TopTopFactory extends BeverageAbstractFactory {

	public TopTopFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Leaf createLeaf() {
		// TODO Auto-generated method stub
		return new GreenLeaf();

	}

	@Override
	public Milk createMilk() {
		// TODO Auto-generated method stub
		return new SoyMilk();
	}

}
