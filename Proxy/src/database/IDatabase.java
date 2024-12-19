package database;

import model.Movie;

public interface IDatabase {
	public Movie retreive(String key);
}
