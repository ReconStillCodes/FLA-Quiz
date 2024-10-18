package store;

import java.util.ArrayList;
import java.util.Scanner;

import factory.BeverageAbstractFactory;
import factory.TapTopFactory;
import model.leaf.Leaf;
import model.milk.Milk;
import model.tea.Beverage;
import model.tea.MilkTea;
import model.tea.Tea;

public class TapTopStore implements Store {
	private BeverageAbstractFactory factory;
	private ArrayList<Beverage> teaList;
	private Scanner scan;

	public TapTopStore() {
		super();
		init();

		int choice = 0;

		do {
			displayMenu();
			do {
				System.out.print(">> ");
				choice = scan.nextInt();
				scan.nextLine();
			} while (choice < 0 || choice > 2);
			cls();

			if (choice == 1 || choice == 2) {
				Beverage b = order(choice);
				teaList.add(b);
			} else {
				exit();
			}

		} while (choice != 0);
	}

	private void init() {
		factory = new TapTopFactory();
		teaList = new ArrayList<Beverage>();
		scan = new Scanner(System.in);
	}

	private void displayMenu() {
		System.out.println("Welcome to Tap Top Cafe");
		System.out.println("1. Milk Tea");
		System.out.println("2. Tea");
		System.out.println("0. Exit");
	}

	private void exit() {
		System.out.println("Orders:");

		for (Beverage b : teaList) {
			System.out.println("- " + b.getName());
		}
		System.out.println("Thank You!!!");
	}

	@Override
	public Beverage order(int choice) {
		Beverage b = null;
		Leaf l = factory.createLeaf();
		if (choice == 1) {

			Milk m = factory.createMilk();

			b = new MilkTea(l, m);
		} else {
			b = new Tea(l);
		}
		b.prepare();
		return b;
	}

	private void cls() {
		for (int i = 0; i < 10; i++)
			System.out.printf("\n\n\n");
	}
}
