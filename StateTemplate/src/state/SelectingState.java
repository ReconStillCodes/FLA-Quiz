package state;

import model.IceCream;

public class SelectingState extends State {

	public SelectingState(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeState() {
		iceCream.setState(new GenerateState(iceCream));

	}

}
