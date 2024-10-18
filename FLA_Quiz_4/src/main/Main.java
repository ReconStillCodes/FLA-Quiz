package main;

import java.util.Scanner;

import store.TapTopStore;
import store.TopTopStore;

public class Main {
	Scanner scan = new Scanner(System.in);

	public Main() {
		int choice = 0;

		do {
			displayMenu();
			do {
				System.out.print(">> ");
				choice = scan.nextInt();
				scan.nextLine();

			} while (choice < 0 || choice > 2);

			if (choice == 1) {
				new TapTopStore();
			} else {
				new TopTopStore();
			}
		} while (choice != 0);
	}

	private void displayMenu() {
		System.out.println("Which Cafe do you want to go?");
		System.out.println("1. Tap Top Cafe");
		System.out.println("2. Top Top Cafe");
	}

	public static void main(String[] args) {
		new Main();

	}

}
