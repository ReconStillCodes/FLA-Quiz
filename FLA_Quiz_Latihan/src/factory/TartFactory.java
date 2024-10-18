package factory;

import mode.cake.Cake;
import mode.cake.PlainTart;
import mode.cake.ToppingTart;
import mode.payment.Cash;

public class TartFactory extends CakeFactory {

	@Override
	public Cake createCake(String name, String softness, Boolean isTopping, String topping, Cash payment) {
		Cake c;
		if (isTopping) {
			c = new ToppingTart(name, topping, softness, payment);
		} else {
			c = new PlainTart(name, topping, softness, payment);
		}
		return c;
	}

}
