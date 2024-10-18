package mode.cake;

import mode.payment.Cash;

public class PlainCupcake extends Cake {

	public PlainCupcake(String name, String softness, String Topping, Cash payment) {
		super(name, softness, Topping, payment);
		// TODO Auto-generated constructor stub
		this.topping = "-";
	}

	@Override
	public void displayInfo() {
		System.out.printf("%-15s : %s (Cupcake)\n", "Name", this.name);
		System.out.printf("%-15s : %s\n", "Softness", this.softness);
		System.out.printf("%-15s : %s\n", "Topping", this.topping);
		System.out.printf("%-15s : %s\n", "Payment Type", this.payment.getName());
		System.out.printf("%-15s : %s\n", "Price", this.payment.toString());

	}

}