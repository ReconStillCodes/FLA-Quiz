package main;

import java.util.Scanner;

import factory.BucketIceCreamFactory;
import factory.ConeIceCreamFactory;
import factory.IceCreamFactory;
import model.IceCream;
import repository.History;

public class Main {

	private Scanner scan = new Scanner(System.in);
	private IceCreamFactory coneStall = new ConeIceCreamFactory();
	private IceCreamFactory bucketStall = new BucketIceCreamFactory();
	private History history = History.getInstance();

	public Main() {
		Integer choice = null;

		do {
			displayMenu();
			do {
				System.out.print("Input >> ");
				choice = scan.nextInt();
				scan.nextLine();
			} while (choice < 0 || choice > 2);
			clear();
			directMenu(choice);
		} while (choice != 0);
	}

	public static void main(String[] args) {
		new Main();

	}

	private void displayMenu() {
		System.out.println("Where do you want to go?");
		System.out.println("1. Cone Ice Cream Stall");
		System.out.println("2. Bucket Ice Cream Stall");
		System.out.println("0. Exit");
	}

	private void directMenu(Integer choice) {
		switch (choice) {
		case 1:
			inputIceCream("cone");
			break;
		case 2:
			inputIceCream("bucket");
			break;
		case 0:
			exit();
			break;
		}
	}

	private void inputIceCream(String icType) {
		System.out.println("Welcome to kukuruyuk " + icType + " ice cream Stall");
		System.out.println("What flavour do you want for your " + icType + " ice cream?");

		String flavour = null, type = null;

		do {
			System.out.print("input ['Chocolate' or 'Strawberry'] >> ");
			flavour = scan.nextLine();
		} while (!flavour.equals("Chocolate") && !flavour.equals("Strawberry"));

		do {
			System.out.print("input ['regular' or 'special'] >> ");
			type = scan.nextLine();
		} while (!type.equals("regular") && !type.equals("special"));

		clear();

		directOrder(icType, flavour, type);
	}

	private void directOrder(String icType, String flavour, String type) {
		if (icType.equals("cone")) {
			order(coneStall, flavour, type);
		} else {
			order(bucketStall, flavour, type);
		}
	}

	private void order(IceCreamFactory factory, String flavour, String type) {
		clear();
		IceCream ic = factory.orderIceCream(flavour, type);
		scan.nextLine();
		history.addIC(ic);
	}

	private void exit() {
		clear();
		history.displayHistory();
	}

	private void clear() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}

}
