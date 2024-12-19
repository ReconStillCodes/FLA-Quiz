package model;

public class Movie {
	private String name;
	private String desc;

	public Movie(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void displayInfo() {
		System.out.println("Movie Name : " + name);
		System.out.println("Movie Desc : " + desc);
	}
}
