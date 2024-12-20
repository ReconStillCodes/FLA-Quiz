package model;

import state.IdleState;
import state.State;

public class IceCream {
	protected String type, flavor;
	protected State state;

	public IceCream() {
		String type = "";
		String flavor = "";
		state = new IdleState(this);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
