package model;

public class RegularBucketIceCream extends IceCream {

	public RegularBucketIceCream(String flavour) {
		super();
		this.flavour = flavour;
		this.type = "Regular";
		this.price = 40000;
		this.name = flavour + " Regular Bucket Ice Cream";
	}

	@Override
	public void prepare() {
		System.out.println("Prepare Bucket");
		System.out.println("Fill the ice cream until the box is full");

	}

}
