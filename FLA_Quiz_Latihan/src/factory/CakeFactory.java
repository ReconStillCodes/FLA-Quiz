package factory;

import mode.cake.Cake;
import mode.payment.Cash;

public abstract class CakeFactory {

	public Cake orderCake(String name, String softness, Boolean isTopping, String Topping, Cash payment) {

		Cake c = createCake(name, softness, isTopping, Topping, payment);
		System.out.println("Cake is Baked");
		return c;

	}

	public abstract Cake createCake(String name, String softness, Boolean isTopping, String Topping, Cash payment);
}
