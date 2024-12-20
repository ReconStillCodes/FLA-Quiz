package component;

import mediator.Login;

public class ListSelection implements IComponent {
	private String name;
	private String value;

	private Login mediator;

	public ListSelection(Login mediator) {
		super();
		this.mediator = mediator;
		name = "listSelection";
		value = "";
	}

	@Override
	public void send() {
		if (value.equals("1")) {
			mediator.send(this, "captchaTB");
		} else if (value.equals("2")) {
			mediator.send(this, "adminTB");
		}
	}

	@Override
	public void input() {
		System.out.println("1. Login as User");
		System.out.println("2. Login as Admin");

		do {
			System.out.print(">> ");
			value = scan.nextLine();
		} while (value.equals("") && !value.equals("1") && !value.equals("2"));
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
