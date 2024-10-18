package factory;

import mode.cake.Cake;
import mode.cake.PlainCupcake;
import mode.cake.ToppingCupcake;
import mode.payment.Cash;

public class CupcakeFactory extends CakeFactory {

	@Override
	public Cake createCake(String name, String softness, Boolean isTopping, String topping, Cash payment) {
		Cake c;
		if (isTopping) {
			c = new ToppingCupcake(name, topping, softness, payment);
		} else {
			c = new PlainCupcake(name, topping, softness, payment);
		}
		return c;
	}

}
