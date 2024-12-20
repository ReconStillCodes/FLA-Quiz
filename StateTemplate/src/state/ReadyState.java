package state;

import model.IceCream;

public class ReadyState extends State {

	public ReadyState(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeState() {
		iceCream.setState(new IdleState(iceCream));

	}

}
