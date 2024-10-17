package model;

public class SpecialConeIceCream extends IceCream {

	public SpecialConeIceCream(String flavour) {
		super();
		this.flavour = flavour;
		this.type = "Special";
		this.price = 17000;
		this.name = flavour + " Special Cone Ice Cream";
	}

	@Override
	public void prepare() {
		System.out.println("Prepare Cone");
		System.out.println("Put the " + flavour + " ice cream falvour on top of the cone");
		System.out.println("Put some " + flavour + " on top of the ice cream");
		System.out.println("Add extra waffle stick on top of the ice cream");

	}

}
