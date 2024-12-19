package main;

import java.util.Scanner;

import facade.GameFacade;
import model.CPU;
import model.Fan;
import model.Monitor;

public class Main {
	Scanner scan = new Scanner(System.in);

	public Main() {
		CPU cpu = new CPU();
		Monitor monitor = new Monitor();
		Fan fan = new Fan();
		GameFacade facade = new GameFacade(cpu, monitor, fan);

		cpu.displayStatus();
		monitor.displayStatus();
		fan.displayStatus();

		do {
			displayMenu();
			int choice = -1;

			do {
				try {
					System.out.print(">> ");
					choice = scan.nextInt();

					scan.nextLine();
				} catch (Exception e) {
					System.out.println("Enter valid input");
					scan.nextLine();
				}

			} while (choice < 1 || choice > 2);

			if (choice == 1)
				facade.startGame();
			else if (choice == 2)
				facade.stopGame();

			enter();

		} while (true);

	}

	public void enter() {
		System.out.print("Enter...");
		scan.nextLine();

		for (int i = 0; i < 10; i++) {
			System.out.print("\n\n\n");
		}
	}

	public void displayMenu() {
		System.out.println("1. Start Playing Game");
		System.out.println("2. Stop Paling Game");
	}

	public static void main(String[] args) {
		new Main();
	}

}
