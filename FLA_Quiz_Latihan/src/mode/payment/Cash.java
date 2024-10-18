package mode.payment;

public class Cash {
	private String name;
	private Double price;

	public Cash(Double price) {
		super();
		this.price = price;
		this.name = "Cash";
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "$" + price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
