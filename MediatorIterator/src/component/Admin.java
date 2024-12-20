package component;

import mediator.Login;

public class Admin implements IComponent {

	private String name, value;
	private Login mediator;

	public Admin(Login mediator) {
		super();
		this.mediator = mediator;
		name = "adminTB";
		value = "";
	}

	@Override
	public void send() {
		mediator.send(this, "submitBTN");

	}

	@Override
	public void input() {
		do {
			System.out.print("Input Admin Secret: ");
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

}
