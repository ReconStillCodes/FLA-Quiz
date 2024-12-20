package iterator;

import java.util.ArrayList;

import model.Applicant;

public class ApplicantIterator implements Iterator {
	ArrayList<Applicant> lists;
	int index;

	public ApplicantIterator(ArrayList<Applicant> lists) {
		super();
		this.lists = lists;
		index = 0;
	}

	@Override
	public Boolean hasNext() {
		return index < lists.size();
	}

	@Override
	public Applicant getNest() {
		return lists.get(index++);
	}

}
