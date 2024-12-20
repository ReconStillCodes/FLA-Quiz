package model;

import java.util.Random;

import state.State;
import state.SubmissionState;

public class Applicant {
	private String code, name, preference;
	Integer experience;
	private State state;

	public Applicant(String name, Integer experience, String preference) {
		super();
		this.name = name;
		this.experience = experience;
		this.preference = preference;
		this.setState(new SubmissionState(this));
		code = generateCode();
	}

	public String generateCode() {
		Random rand = new Random();

		String strRandomizer = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder strBuilder = new StringBuilder();

		for (int i = 0; i < 10; i++) {
			int idx = rand.nextInt(strRandomizer.length());
			strBuilder.append(strRandomizer.charAt(idx));
		}

		return strBuilder.toString();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void displayInfo() {
		System.out.println("Applicant Code : " + code);
		System.out.println("Applicant Name : " + name);
		System.out.println("Job Experience : " + experience);
		System.out.println("Job Preference : " + preference);
		System.out.println("Current Phase  : " + state.displayState());
	}

}
