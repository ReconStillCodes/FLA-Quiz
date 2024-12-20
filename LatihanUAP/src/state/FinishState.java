package state;

import model.Applicant;

public class FinishState implements State {

	private Applicant applicant;

	public FinishState(Applicant applicant) {
		super();
		this.applicant = applicant;
	}

	@Override
	public String displayState() {
		return "Applicant Successfully Saved";

	}

	@Override
	public void changeState() {
		System.out.println("No more state");

	}
}
