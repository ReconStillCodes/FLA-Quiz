package factory;

import model.leaf.BlackLeaf;
import model.leaf.Leaf;
import model.milk.FullCreamMilk;
import model.milk.Milk;

public class TapTopFactory extends BeverageAbstractFactory {

	public TapTopFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Leaf createLeaf() {
		// TODO Auto-generated method stub
		return new BlackLeaf();
	}

	@Override
	public Milk createMilk() {
		// TODO Auto-generated method stub
		return new FullCreamMilk();
	}

}
