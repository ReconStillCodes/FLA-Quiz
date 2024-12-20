package state;

import model.IceCream;

public class GenerateState extends State {

	public GenerateState(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeState() {
		iceCream.setState(new ReadyState(iceCream));

	}

}
