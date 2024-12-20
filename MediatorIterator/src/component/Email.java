package component;

import mediator.Login;

public class Email implements IComponent {

	private String name;
	private String value;

	private Login mediator;

	public Email(Login mediator) {
		super();
		this.mediator = mediator;
		name = "emailTB";
		value = "";
	}

	@Override
	public void send() {
		mediator.send(this, "passwordTB");

	}

	@Override
	public void input() {
		do {
			System.out.print("Input Email: ");
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
		// TODO Auto-generated method stub
		return value;
	}

}
