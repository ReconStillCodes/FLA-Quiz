package model.tea;

import model.leaf.Leaf;
import model.milk.Milk;

public class MilkTea extends Beverage {

	private Milk milk;

	public MilkTea(Leaf leaf, Milk milk) {
		super(leaf);
		this.milk = milk;
		this.name = "Milk Tea";
	}

	public Milk getMilk() {
		return milk;
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
	}

	@Override
	public void prepare() {
		System.out.println("Steep the : " + leaf.getName() + "(s) about a minute");
		System.out.println("Strain the leaf(s)");
		System.out.println("Add some " + milk.getName());
		System.out.println("The " + name + " is ready!");
	}

}
