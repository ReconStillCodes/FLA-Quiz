package facade;

import model.CPU;
import model.Fan;
import model.Monitor;

public class GameFacade {

	public CPU cpu;
	public Monitor monitor;
	public Fan fan;
	public Boolean isPlaying = false;

	public GameFacade(CPU cpu, Monitor monitor, Fan fan) {
		super();
		this.cpu = cpu;
		this.monitor = monitor;
		this.fan = fan;
	}

	public void startGame() {
		if (isPlaying) {
			System.out.println("Game already Started");
			return;
		}

		isPlaying = true;

		cpu.turnOn();
		monitor.turnOn();
		fan.turnOn();

		cpu.displayStatus();
		monitor.displayStatus();
		fan.displayStatus();
		return;
	}

	public void stopGame() {
		if (!isPlaying) {
			System.out.println("Game already Stopped");
			return;
		}

		isPlaying = false;

		cpu.turnOff();
		monitor.turnOff();
		fan.turnOff();

		cpu.displayStatus();
		monitor.displayStatus();
		fan.displayStatus();
		return;
	}

}
