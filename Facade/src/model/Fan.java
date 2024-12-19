package model;

public class Fan extends Device {

	public Fan() {
		super();
	}

	@Override
	public void displayStatus() {
		System.out.println("Fan is " + status);

	}

}
