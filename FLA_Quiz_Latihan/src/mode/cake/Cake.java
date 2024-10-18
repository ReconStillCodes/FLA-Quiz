package mode.cake;

import mode.payment.Cash;

public abstract class Cake {
	protected String name;
	protected String softness;
	protected String topping;
	protected Cash payment;

	public Cake(String name, String softness, String topping, Cash payment) {
		super();
		this.name = name;
		this.softness = softness;
		this.payment = payment;
		this.topping = null;
	}

	public abstract void displayInfo();

}
