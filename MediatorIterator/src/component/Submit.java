package component;

import java.util.ArrayList;

import iterator.ComponentIterator;
import mediator.Login;

public class Submit implements IComponent {

	private String name, value;
	private Login mediator;

	private ArrayList<IComponent> components;

	public Submit(Login mediator) {
		super();
		this.mediator = mediator;
		name = "submitBTN";
		value = "";
		components = new ArrayList<IComponent>();
	}

	public void add(IComponent c) {
		components.add(c);
	}

	@Override
	public void send() {
		System.out.println(value);
	}

	@Override
	public void input() {
		System.out.print("Press Enter to Continue");
		scan.nextLine();

		if (validate()) {
			value = "Directing to Home Page";
		} else {
			value = "Error...";
		}
		send();
	}

	public Boolean validate() {
		ComponentIterator it = new ComponentIterator(components);

		while (it.hasNext()) {
			IComponent next = it.getNext();
			if (next.getName().equals("emailTB") && !validateEmail(next)) {
				return false;
			} else if (next.getName().equals("passwordTB") && !validatePassword(next)) {
				return false;
			} else if (next.getName().equals("adminTB") && !validatePassword(next)) {
				return false;
			} else if (next.getName().equals("captchaTB") && !validatePassword(next)) {
				return false;
			}
		}

		return true;
	}

	public Boolean validateEmail(IComponent c) {

		if (!c.getValue().contains("@")) {
			return false;
		}

		return true;
	}

	public Boolean validatePassword(IComponent c) {
		String value = c.getValue();
		for (int i = 0; i < c.getValue().length(); i++) {
			if (!Character.isAlphabetic(value.charAt(i)) && !Character.isDigit(value.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	public Boolean validateAdmin(IComponent c) {
		if (!c.getValue().equals("4dminS3cr3t")) {
			return false;
		}
		return true;
	}

	public Boolean valdiateCaptcha(IComponent c) {
		Captcha captcha = (Captcha) c;
		if (!captcha.getValue().equals(captcha.getReal())) {
			return false;
		}
		return true;
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
