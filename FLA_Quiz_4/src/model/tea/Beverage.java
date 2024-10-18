package model.tea;

import model.leaf.Leaf;

public abstract class Beverage {
	protected String name;
	protected Leaf leaf;

	public Beverage(Leaf leaf) {
		super();
		this.leaf = leaf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Leaf getLeaf() {
		return leaf;
	}

	public void setLeaf(Leaf leaf) {
		this.leaf = leaf;
	}

	public abstract void prepare();
}
