package repository;

import java.util.ArrayList;

import mode.cake.Cake;

public class CakeOrder {

	private ArrayList<Cake> cakes;
	private static CakeOrder instance = null;

	public CakeOrder() {
		super();
		this.cakes = new ArrayList<Cake>();
	}

	public static CakeOrder getInstance() {
		if (instance == null) {
			instance = new CakeOrder();
		}
		return instance;
	}

	public void displayCakes() {
		System.out.println("Orders");
		System.out.println("============================");

		for (Cake c : cakes) {
			c.displayInfo();
			System.out.println("");
		}
	}

	public void addCake(Cake c) {
		cakes.add(c);
	}
}
