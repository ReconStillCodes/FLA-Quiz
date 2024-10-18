package mode.payment;

public class CryptoAdapter extends Cash {
	private Crypto x;

	public CryptoAdapter(Double price, Crypto x) {
		super(price / 2);
		this.x = x;

		x.setPrice(this.getPrice());
	}

	@Override
	public String toString() {
		return x.toString();
	}
}
