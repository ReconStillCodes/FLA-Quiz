package state;

import model.IceCream;

public abstract class State {

	protected IceCream iceCream;

	public State(IceCream iceCream) {
		super();
		this.iceCream = iceCream;
	}

	public abstract void changeState();

}
