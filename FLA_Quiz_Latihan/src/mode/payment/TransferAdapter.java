package mode.payment;

public class TransferAdapter extends Cash {
	private Transfer x;

	public TransferAdapter(Double price, Transfer x) {
		super(price * 1.1);
		this.x = x;
		x.setPrice(this.getPrice());
	}

	@Override
	public String toString() {
		return x.toString();
	}

}
