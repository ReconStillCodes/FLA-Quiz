package builder;

import model.Burger;

public abstract class BurgerBuilder {
	protected Burger burger;

	public abstract Burger build();

	public void setName(String name) {
		burger.setName(name);
	}

	public void setMeat(String meat[]) {
		burger.setMeat(meat);
	}

	public void setCucumber(Boolean cucumber) {
		burger.setCucumber(cucumber);
	}

	public void setEgg(Boolean egg) {
		burger.setEgg(egg);
	}

	public void setTomato(Boolean tomato) {
		burger.setTomato(tomato);
	}

	public void setOnion(Boolean onion) {
		burger.setOnion(onion);
	}

	public void setLettuce(Boolean lettuce) {
		burger.setLettuce(lettuce);
	}

	public void setPrice(Integer price) {
		burger.setPrice(price);
	}

}
