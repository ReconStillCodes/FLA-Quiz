package component;

import mediator.Login;

public class Password implements IComponent {

	private String name, value;
	private Login mediator;

	public Password(Login mediator) {
		super();
		this.mediator = mediator;
		name = "passwordTB";
		value = "";
	}

	@Override
	public void send() {
		mediator.send(this, "listSelection");
	}

	@Override
	public void input() {
		do {
			System.out.print("Input Password: ");
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
