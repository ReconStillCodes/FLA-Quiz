package Obervable;

import java.util.ArrayList;

import observer.MusicPlay;

public class AngleMusic {
	private ArrayList<MusicPlay> companies;

	public AngleMusic() {
		companies = new ArrayList<MusicPlay>();
	}

	public void addCompanies(MusicPlay company) {
		companies.add(company);
	}

	public void removeCompanies(MusicPlay company) {
		companies.remove(company);
	}

	public void play(String music) {
		for (MusicPlay c : companies) {
			c.play(music);
		}
	}

}
