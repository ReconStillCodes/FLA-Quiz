package component;

import java.util.Scanner;

public interface IComponent {
	Scanner scan = new Scanner(System.in);

	public void send();

	public void input();

	public String getName();

	public String getValue();
}
