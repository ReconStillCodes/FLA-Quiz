package main;

import java.util.Scanner;

import database.MovieDatabaseProxy;
import model.Movie;

public class Main {
	MovieDatabaseProxy database = new MovieDatabaseProxy();
	Scanner scan = new Scanner(System.in);

	public Main() {

		do {
			cls();
			displayMenu();
			System.out.print("Input Movie Title >>");
			String title = scan.nextLine();

			Movie movie = database.retreive(title);
			if (movie == null) {
				System.out.println("No movie found");
			} else {
				movie.displayInfo();
			}

			enter();

		} while (true);
	}

	public void displayMenu() {
		System.out.println("Angle Flix");
		System.out.println("======================");
		System.out.println("What Movie do you want to know?");
	}

	public void cls() {
		for (int i = 0; i < 10; i++) {
			System.out.println("\n\n\n");
		}
	}

	public void enter() {
		System.out.print("\nEnter to continue >>");
		scan.nextLine();
	}

	public static void main(String[] args) {
		new Main();
	}

}
