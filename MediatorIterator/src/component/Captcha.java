package component;

import java.util.Random;

import mediator.Login;

public class Captcha implements IComponent {
	private String name, value, real;
	private Login mediator;

	public Captcha(Login mediator) {
		super();
		this.mediator = mediator;
		name = "captchaTB";
		value = "";

		Random random = new Random();
		char randomLetter = (char) ('a' + random.nextInt(26));
		int numberOfLetters = 4;
		StringBuilder randomLetters = new StringBuilder();
		for (int i = 0; i < numberOfLetters; i++) {
			randomLetters.append((char) ('a' + random.nextInt(26)));
		}

		real = randomLetters.toString();

	}

	@Override
	public void send() {
		mediator.send(this, "submitBTN");

	}

	@Override
	public void input() {
		do {
			System.out.print("Input Catptcha [ " + real + " ] : ");
			value = scan.nextLine();
		} while (value.equals(""));
		send();

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getValue() {
		return value;
	}

	public String getReal() {
		return value;
	}

}
