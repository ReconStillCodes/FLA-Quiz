package model;

public class RegularConeIceCream extends IceCream {

	public RegularConeIceCream(String flavour) {
		super();
		this.flavour = flavour;
		this.type = "Regular";
		this.price = 10000;
		this.name = flavour + " Regular Cone Ice Cream";
	}

	@Override
	public void prepare() {
		System.out.println("Prepare Cone");
		System.out.println("Put the " + this.flavour + " ice cream flavour on top of cone");
	}

}
