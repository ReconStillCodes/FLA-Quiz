package observer;

public class RadioCompany implements MusicPlay {
	private String name;

	public RadioCompany(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play(String music) {
		System.out.println(name + " is now playing '" + music + "'");

	}

}
