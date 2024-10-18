package main;

import java.util.Scanner;

import factory.CupcakeFactory;
import factory.TartFactory;
import mode.cake.Cake;
import mode.payment.Cash;
import mode.payment.Crypto;
import mode.payment.CryptoAdapter;
import mode.payment.Transfer;
import mode.payment.TransferAdapter;
import repository.CakeOrder;

public class Main {
	Scanner scan;
	CupcakeFactory cFactory;
	TartFactory tFactory;
	CakeOrder orders;

	public Main() {
		init();

		int choice = 0;

		do {
			displayMenu();
			do {
				System.out.print(">> ");
				choice = scan.nextInt();
				scan.nextLine();
			} while (choice < 1 || choice > 3);
			cls();

			if (choice == 1) {
				order();
			} else if (choice == 2) {
				orders.displayCakes();
			} else {
				exit();
			}
		} while (choice != 0);
	}

	private void init() {
		scan = new Scanner(System.in);
		cFactory = new CupcakeFactory();
		tFactory = new TartFactory();
		orders = CakeOrder.getInstance();
	}

	private void order() {
		String type = inputType();
		String name = inputName();
		String softness = inputSoftness();
		Boolean isTopping = inputToppingChoice();
		String Topping = "-";

		if (isTopping) {
			Topping = inputTopping();
		}

		double price = inputPrice();
		String paymentType = inputPaymentType();

		Cash payment = null;
		if (paymentType.equals("Cash")) {
			payment = new Cash(price);
		} else if (paymentType.equals("Transfer")) {
			Transfer t = new Transfer(price);
			payment = new TransferAdapter(price, t);
		} else {
			Crypto c = new Crypto(price);
			payment = new CryptoAdapter(price, c);
		}

		Cake cake = null;
		if (type.equals("Cupcake")) {

			cake = cFactory.createCake(name, softness, isTopping, Topping, payment);
		} else {
			cake = tFactory.createCake(name, softness, isTopping, Topping, payment);
		}

		orders.addCake(cake);
	}

	private String inputType() {
		String type;

		do {
			System.out.print("Confectionary Type [Cupcake | Tart]: ");
			type = scan.nextLine();
		} while (!type.equals("Cupcake") && !type.equals("Tart"));
		return type;
	}

	private String inputName() {
		String name = null;
		do {
			System.out.print("name [5 - 15]: ");
			name = scan.nextLine();
		} while (name.length() < 5 || name.length() > 15);
		return name;
	}

	private String inputSoftness() {
		String x;
		do {
			System.out.print("Softness [Fluffy | Medium | Hard]: ");
			x = scan.nextLine();
		} while (!x.equals("Fluffy") && !x.equals("Medium") && !x.equals("Hard"));
		return x;
	}

	private Boolean inputToppingChoice() {
		String x;
		do {
			System.out.print("Add Topping [Y | N]: ");
			x = scan.nextLine();
		} while (!x.equals("Y") && !x.equals("N"));

		if (x.equals("Y"))
			return true;
		else
			return false;
	}

	private String inputTopping() {
		String x = null;
		do {
			System.out.print("Topping [5 - 15]: ");
			x = scan.nextLine();
		} while (x.length() < 5 || x.length() > 15);
		return x;
	}

	private double inputPrice() {
		double x = -1;
		do {
			System.out.print("Price [10 - 50]: ");
			x = scan.nextInt();
			scan.nextLine();
		} while (x < 10 || x > 50);
		return x;
	}

	private String inputPaymentType() {
		String x;
		do {
			System.out.print("Payment Type [Cash | Transfer | Crypto]: ");
			x = scan.nextLine();
		} while (!x.equals("Cash") && !x.equals("Transfer") && !x.equals("Crypto"));
		return x;
	}

	private void displayMenu() {
		System.out.println("Nom Nom Co.");
		System.out.println("===============");
		System.out.println("1. Bake Confectionary");
		System.out.println("2. View Confectionary Order");
		System.out.println("3. Exit");
	}

	private void exit() {
		System.out.println("Thank you for using Nomnom Service");
	}

	private void cls() {
		for (int i = 0; i < 10; i++)
			System.out.printf("\n\n\n");
	}

	public static void main(String[] args) {
		new Main();

	}

}
