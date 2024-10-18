package director;

import builder.BeefBurgerBuilder;
import builder.ChickenBurgerBuilder;
import model.Burger;

public class BurgerDirector {
	private BeefBurgerBuilder bb;
	private ChickenBurgerBuilder cb;

	public BurgerDirector() {
		super();
		this.bb = new BeefBurgerBuilder();
		this.cb = new ChickenBurgerBuilder();
	}

	public Burger buildChickenBurger() {
		String meat[] = { "Chicken" };
		cb.setMeat(meat);
		cb.setCucumber(false);
		cb.setEgg(false);
		cb.setTomato(true);
		cb.setOnion(false);
		cb.setLettuce(true);
		cb.setPrice(28000);
		cb.setName("Chicken Burger");
		return cb.build();
	}

	public Burger buildBigChickenBurger() {
		String meat[] = { "Chicken", "Chicken" };
		cb.setMeat(meat);
		cb.setCucumber(false);
		cb.setEgg(true);
		cb.setTomato(true);
		cb.setOnion(false);
		cb.setLettuce(true);
		cb.setPrice(40000);
		cb.setName("Big Chicken Burger");
		return cb.build();
	}

	public Burger buildBeefBurger() {
		String meat[] = { "Beef" };
		bb.setMeat(meat);
		bb.setCucumber(false);
		bb.setEgg(false);
		bb.setTomato(true);
		bb.setOnion(true);
		bb.setLettuce(true);
		bb.setPrice(35000);
		bb.setName("Beef Burger");
		return bb.build();
	}

	public Burger buildSpecialBurger() {
		String meat[] = { "Chicken", "Burger" };
		bb.setMeat(meat);
		bb.setCucumber(true);
		bb.setEgg(false);
		bb.setTomato(true);
		bb.setOnion(true);
		bb.setLettuce(false);
		bb.setPrice(50000);
		bb.setName("Special Burger");
		return bb.build();
	}
}
