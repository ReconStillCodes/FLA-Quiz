package main;

import java.util.Scanner;

import Obervable.AngleMusic;
import observer.HotelCompany;
import observer.RadioCompany;

public class Main {

	AngleMusic angleMusic = new AngleMusic();
	Scanner scan = new Scanner(System.in);

	public Main() {
		init();

		do {
			displayMenu();
			System.out.print("Input current track >> ");
			String music = scan.nextLine();
			angleMusic.play(music);
			scan.nextLine();
			cls();

		} while (true);
	}

	public void displayMenu() {
		System.out.println("Apple Music");
		System.out.println("=====================");
	}

	public void cls() {
		for (int i = 0; i < 10; i++) {
			System.out.println("\n\n\n");
		}
	}

	public void init() {
		angleMusic.addCompanies(new RadioCompany("PT Gogo Company"));
		angleMusic.addCompanies(new HotelCompany("PT Loga Company"));
		angleMusic.addCompanies(new RadioCompany("PT Lolo Company"));
	}

	public static void main(String[] args) {
		new Main();

	}

}
