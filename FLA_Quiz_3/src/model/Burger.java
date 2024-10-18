package model;

public abstract class Burger implements Cloneable {

	protected String name, type;
	protected String meat[];
	protected Boolean cucumber, egg, tomato, onion, lettuce;
	protected Integer price;

	public Burger() {
		super();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getMeat() {
		return meat;
	}

	public void setMeat(String[] meat) {
		this.meat = meat;
	}

	public Boolean getCucumber() {
		return cucumber;
	}

	public void setCucumber(Boolean cucumber) {
		this.cucumber = cucumber;
	}

	public Boolean getEgg() {
		return egg;
	}

	public void setEgg(Boolean egg) {
		this.egg = egg;
	}

	public Boolean getTomato() {
		return tomato;
	}

	public void setTomato(Boolean tomato) {
		this.tomato = tomato;
	}

	public Boolean getOnion() {
		return onion;
	}

	public void setOnion(Boolean onion) {
		this.onion = onion;
	}

	public Boolean getLettuce() {
		return lettuce;
	}

	public void setLettuce(Boolean lettuce) {
		this.lettuce = lettuce;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
