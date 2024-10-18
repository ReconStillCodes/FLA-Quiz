package store;

import model.tea.Beverage;

public interface Store {
	public abstract Beverage order(int choice);
}
