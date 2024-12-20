package main;

import java.util.ArrayList;
import java.util.Scanner;

import iterator.ApplicantIterator;
import model.Applicant;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Applicant> lists = new ArrayList<Applicant>();

	public Main() {
		Boolean isRunning = true;

		do {
			displayMenu();
			int choice = -1;
			do {

				try {
					System.out.print(">> ");
					choice = scan.nextInt();
					scan.nextLine();
				} catch (Exception e) {
					scan.nextLine();
				}

			} while (choice < 1 || choice > 3);

			if (choice == 3) {
				isRunning = false;
			}

			else if (choice == 1) {
				inputMenu();
			} else {
				viewForm();
			}

			cls();
		} while (isRunning);

		System.out.println("Thank you for using JekPedia");
	}

	public void viewForm() {
		ApplicantIterator it = new ApplicantIterator(lists);

		while (it.hasNext()) {
			cls();
			String choice = "";
			Applicant a = it.getNest();

			do {
				a.displayInfo();

				System.out.print("\n\n[N for next | Q for exit | P for phase] : ");

				do {
					choice = scan.nextLine();
				} while (!choice.equals("N") && !choice.equals("Q") && !choice.equals("P"));

				if (choice.equals("P")) {
					a.getState().changeState();
				}
			} while (choice.equals("P"));

			if (choice.equals("Q")) {
				break;
			}

		}
	}

	public void inputMenu() {
		String name = inputName();
		Integer experience = inputExperience();
		String preference = inputPreference();

		Applicant applicant = new Applicant(name, experience, preference);
		lists.add(applicant);
		System.out.println("Data Submitted\n");
	}

	public String inputName() {
		String x = "";
		do {
			System.out.print("Input Name [cannot be empty] : ");
			x = scan.nextLine();
		} while (x.equals(""));
		return x;
	}

	public Integer inputExperience() {
		Integer x = 0;
		do {
			try {
				System.out.print("Input job experience [>1] : ");
				x = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				scan.nextLine();
			}

		} while (x <= 0);
		return x;
	}

	public String inputPreference() {
		String x = "";
		do {
			System.out.print("Input job preference [Backend Dev | Frontend Dev][Case Sensitive] : ");
			x = scan.nextLine();
		} while (!x.equals("Backend Dev") && !x.equals("Frontend Dev"));
		return x;
	}

	public void displayMenu() {
		System.out.println("JekPedia");
		System.out.println("========================");
		System.out.println("1. Register new Applicant Form");
		System.out.println("2. View Form");
		System.out.println("3. Exit");
	}

	public void cls() {
		System.out.print("Press Enter to continue");
		scan.nextLine();
		for (int i = 0; i < 10; i++) {
			System.out.println("\n\n\n");
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
