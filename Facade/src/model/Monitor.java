package model;

public class Monitor extends Device {

	public Monitor() {
		super();

	}

	@Override
	public void displayStatus() {
		System.out.println("Monitor is " + status);

	}

}
