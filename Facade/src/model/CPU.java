package model;

public class CPU extends Device {

	public CPU() {
		super();
	}

	@Override
	public void displayStatus() {
		System.out.println("CPU is " + status);

	}

}
