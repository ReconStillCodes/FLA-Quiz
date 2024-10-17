package repository;

import java.util.ArrayList;

import model.IceCream;

public class History {
	private ArrayList<IceCream> icList;
	private static History instance = null;

	private History() {
		icList = new ArrayList<IceCream>();
	}

	public static History getInstance() {
		if (instance == null) {
			instance = new History();
		}
		return instance;
	}

	public void addIC(IceCream ic) {
		icList.add(ic);
	}

	public void displayHistory() {
		System.out.println("History of Sold Ice Cream");
		System.out.println("=================================");

		int i = 1, total = 0;
		for (IceCream ic : icList) {
			System.out.println(i + ". " + ic.getName() + " - " + ic.getPrice());
			total += ic.getPrice();
		}
		System.out.println("Total Spend " + total);
	}

}
