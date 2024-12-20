package state;

import model.Applicant;

public class SubmissionState implements State {

	private Applicant applicant;

	public SubmissionState(Applicant applicant) {
		super();
		this.applicant = applicant;
	}

	@Override
	public String displayState() {
		return "Going Through Paper Work";

	}

	@Override
	public void changeState() {
		applicant.setState(new InterviewState(applicant));

	}

}
