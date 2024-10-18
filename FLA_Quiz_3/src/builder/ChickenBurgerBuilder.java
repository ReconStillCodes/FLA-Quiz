package builder;

import model.Burger;
import model.ChickenBurger;

public class ChickenBurgerBuilder extends BurgerBuilder {

	public ChickenBurgerBuilder() {
		super();
		this.burger = new ChickenBurger();
	}

	@Override
	public Burger build() {
		Burger result = burger;
		burger = new ChickenBurger();
		return result;
	}

}
