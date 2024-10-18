package main;

import java.util.ArrayList;
import java.util.Scanner;

import director.BurgerDirector;
import model.Burger;

public class Main {
	private Scanner scan;
	private BurgerDirector bd;

	public Main() {
		init();
		int choice = 0;
		do {
			displayMenu();
			do {
				System.out.print(">> ");
				choice = scan.nextInt();
				scan.nextLine();
			} while (choice < 0 || choice > 4);
			cls();
			directMenu(choice);
		} while (choice != 0);
	}

	public static void main(String[] args) {
		new Main();

	}

	public void directMenu(int choice) {
		int qty;
		switch (choice) {
		case 1:
			qty = 4;
			order(choice, qty);
			break;
		case 2:
			qty = 3;
			order(choice, qty);
			break;
		case 3:
			qty = 3;
			order(choice, qty);
			break;
		case 4:
			qty = 5;
			order(choice, qty);
			break;
		case 0:
			System.out.println("Ty");
			break;
		}
	}

	private void order(int choice, int qty) {
		Burger burger = null;
		ArrayList<Burger> bList = new ArrayList<Burger>();
		switch (choice) {
		case 1:
			burger = bd.buildChickenBurger();
			break;
		case 2:
			burger = bd.buildBigChickenBurger();
			break;
		case 3:
			burger = bd.buildBeefBurger();
			break;
		case 4:
			burger = bd.buildSpecialBurger();
			break;
		}

		for (int i = 0; i < qty; i++) {
			try {
				bList.add((Burger) burger.clone());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}

		printOrder(bList);

	}

	private void printOrder(ArrayList<Burger> bList) {
		Integer total = 0;
		System.out.println("Created Burgers:");
		for (Burger b : bList) {
			System.out.println(b.getName() + " - " + b.getPrice());
			total += b.getPrice();
		}
		System.out.println("==============================");
		System.out.println("Total Price: " + total);
		scan.nextLine();
	}

	private void displayMenu() {
		System.out.println("What do you want to order?");
		System.out.println("1. Chicken Burger (4 pieces)");
		System.out.println("2. Big Chicken Burger (3 pieces)");
		System.out.println("3. Beef Burger (3 pieces)");
		System.out.println("4. Special Burger (5 pieces)");
		System.out.println("Exit");

	}

	private void cls() {
		for (int i = 0; i < 10; i++)
			System.out.printf("\n\n\n");
	}

	private void init() {
		scan = new Scanner(System.in);
		bd = new BurgerDirector();
	}

}
