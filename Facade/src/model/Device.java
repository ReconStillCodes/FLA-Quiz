package model;

public abstract class Device {
	protected String status;

	public Device() {
		super();
		status = "off";
	}

	public void turnOn() {
		status = "on";
	}

	public void turnOff() {
		status = "off";

	}

	public abstract void displayStatus();
}
