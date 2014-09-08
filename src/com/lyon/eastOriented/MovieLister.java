package com.lyon.eastOriented;

import java.util.ArrayList;
import java.util.List;

public class MovieLister {

	private Finder finder = new Finder();

	public Movie[] moviesDirectedBy(String arg) {
		List<Movie> allSelectedMovies = new ArrayList<Movie>();
		finder.findAllSelectingTo(selectDirector(arg), allSelectedMovies);
		return allSelectedMovies.toArray(new Movie[allSelectedMovies.size()]);
	}

	private Selector selectDirector(final String arg) {
		return new Selector() {
			public boolean isSelected(Object object) {
				return ((Movie) object).getDirector().equals(arg);
			};
		};
	}

	public void applyToTheMoviesDirectedBy(final MovieAction movieAction, final String director) {
			finder.findAllAndApply(new MovieAction() {	
				@Override
				public void applyTo(Movie movie) {
					movie.ifDirectedByDo(director, movieAction);
				}
			});
	}

}
