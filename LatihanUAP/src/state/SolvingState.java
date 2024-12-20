package state;

import model.Applicant;

public class SolvingState implements State {
	private Applicant applicant;

	public SolvingState(Applicant applicant) {
		super();
		this.applicant = applicant;
	}

	@Override
	public String displayState() {
		return "Sloving Algorithm Problems";

	}

	@Override
	public void changeState() {
		applicant.setState(new FinishState(applicant));

	}
}
