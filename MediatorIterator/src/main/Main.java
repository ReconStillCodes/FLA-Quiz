package main;

import component.Admin;
import component.Captcha;
import component.Email;
import component.ListSelection;
import component.Password;
import component.Submit;
import mediator.Login;

public class Main {

	public Main() {
		Login mediator = new Login();
		Email email = new Email(mediator);
		Password password = new Password(mediator);
		ListSelection listSelection = new ListSelection(mediator);
		Admin admin = new Admin(mediator);
		Captcha captcha = new Captcha(mediator);
		Submit submit = new Submit(mediator);

		mediator.addComponent(email);
		mediator.addComponent(password);
		mediator.addComponent(listSelection);
		mediator.addComponent(admin);
		mediator.addComponent(captcha);
		mediator.addComponent(submit);

		email.input();

	}

	public static void main(String[] args) {
		new Main();
	}

}
