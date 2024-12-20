package mediator;

import java.util.HashMap;

import component.IComponent;
import component.Submit;

public class Login {

	private HashMap<String, IComponent> components;

	public Login() {
		components = new HashMap<>();
	}

	public void send(IComponent sender, String receiver) {

		components.put(sender.getName(), sender);

		IComponent component = getComponent(receiver);
		if (component == null) {
			System.out.println("No " + receiver + " Available");
			return;
		}

		Submit btn = (Submit) components.get("submitBTN");
		btn.add(sender);
		components.put(btn.getName(), btn);

		component.input();

	}

	public IComponent getComponent(String key) {
		return components.get(key);
	}

	public void addComponent(IComponent component) {
		components.put(component.getName(), component);
	}
}
