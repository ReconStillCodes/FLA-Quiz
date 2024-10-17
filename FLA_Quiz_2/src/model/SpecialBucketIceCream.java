package model;

public class SpecialBucketIceCream extends IceCream {

	public SpecialBucketIceCream(String flavour) {
		super();
		this.flavour = flavour;
		this.type = "Special";
		this.price = 50000;
		this.name = flavour + " Special Bucket Ice Cream";
	}

	@Override
	public void prepare() {
		System.out.println("Prepare Bucket");
		System.out.println("Fill the ice cream until the box is full");
		System.out.println("Add some cookies on the top of the ice cream");

	}

}
