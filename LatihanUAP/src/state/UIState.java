package state;

import model.Applicant;

public class UIState implements State {

	private Applicant applicant;

	public UIState(Applicant applicant) {
		super();
		this.applicant = applicant;
	}

	@Override
	public String displayState() {
		return "Designing Applicatn UI UX";

	}

	@Override
	public void changeState() {
		applicant.setState(new FinishState(applicant));

	}
}
