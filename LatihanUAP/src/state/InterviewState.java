package state;

import model.Applicant;

public class InterviewState implements State {
	private Applicant applicant;

	public InterviewState(Applicant applicant) {
		super();
		this.applicant = applicant;
	}

	@Override
	public String displayState() {
		return "Ongoing Interviews";

	}

	@Override
	public void changeState() {
		if (applicant.getPreference().equalsIgnoreCase("Backend Dev")) {
			applicant.setState(new SolvingState(applicant));
		} else {
			applicant.setState(new UIState(applicant));
		}

	}
}
