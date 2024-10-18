package mode.payment;

import java.util.Random;

public class Crypto {
	private String name;
	private Double price;
	private StringBuilder account;

	public Crypto(Double price) {
		super();
		this.price = price;
		this.name = "Crypto";
		account = new StringBuilder();

		Random rand = new Random();
		String characters = "abcdefghijklmnopqrsrtuvwyxz0123456789";

		for (int i = 0; i < 12; i++) {
			char randChar = characters.charAt(rand.nextInt(characters.length()));
			account.append(randChar);
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
		return "ADA " + price + " with address : " + account;
	}

}
