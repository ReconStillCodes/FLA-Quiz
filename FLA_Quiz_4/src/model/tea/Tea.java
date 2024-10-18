package model.tea;

import model.leaf.Leaf;

public class Tea extends Beverage {

	public Tea(Leaf leaf) {
		super(leaf);
		this.name = "Original Tea";
	}

	@Override
	public void prepare() {
		System.out.println("Steep the : " + leaf.getName() + "(s) about a minute");
		System.out.println("Strain the leaf(s)");
		System.out.println("The " + name + " is ready!");

	}
}
