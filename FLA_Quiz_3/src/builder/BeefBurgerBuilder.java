package builder;

import model.BeefBurger;
import model.Burger;

public class BeefBurgerBuilder extends BurgerBuilder {

	public BeefBurgerBuilder() {
		super();
		this.burger = new BeefBurger();
	}

	@Override
	public Burger build() {
		Burger result = burger;
		burger = new BeefBurger();
		return result;
	}
}
