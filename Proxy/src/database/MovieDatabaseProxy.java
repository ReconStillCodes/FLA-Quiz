package database;

import model.Movie;

public class MovieDatabaseProxy implements IDatabase {
	private MovieDatabase database;
	private Movie movie;

	public MovieDatabaseProxy() {
		super();
	}

	@Override
	public Movie retreive(String information) {
		if (database == null) {
			database = new MovieDatabase();
		}

		if (movie != null && movie.getName().equalsIgnoreCase(information)) {
			return movie;
		}

		movie = database.retreive(information);

		return movie;
	}

}
