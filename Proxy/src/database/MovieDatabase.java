package database;

import java.util.HashMap;

import model.Movie;

public class MovieDatabase implements IDatabase {

//	List<Movie> movies;
	HashMap<String, Movie> movies;

	public MovieDatabase() {
		movies = new HashMap<>();
		movies.put("Avengars", new Movie("Avengars", "is an American superhero film"));
		movies.put("Tem & Jorry", new Movie("Tem & Jorry", "is an American cartoon film about a cat and a mouse"));
		movies.put("Crayon Shinchon", new Movie("Crayon Shinchon",
				"is a popular cartoon from Japan also called anime, is about a 5 year old kid"));
	}

	@Override
	public Movie retreive(String key) {

		return movies.get(key);
	}

}
