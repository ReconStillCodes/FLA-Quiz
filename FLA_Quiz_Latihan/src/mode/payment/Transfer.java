package mode.payment;

import java.util.Random;

public class Transfer {
	private String name;
	private Double price;
	private StringBuilder account;

	public Transfer(Double price) {
		super();
		this.price = price;
		this.name = "Transfer";
		this.account = new StringBuilder();

		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int digit = rand.nextInt(10);
			account.append(digit);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public StringBuilder getAccount() {
		return account;
	}

	public void setAccount(StringBuilder account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "$" + price + " with Account Number " + account;
	}

}
