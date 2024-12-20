package state;

import model.IceCream;

public class IdleState extends State {

	public IdleState(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeState() {
		iceCream.setState(new SelectingState(iceCream));
	}

}
