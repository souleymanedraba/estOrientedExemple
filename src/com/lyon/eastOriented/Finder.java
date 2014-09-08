package com.lyon.eastOriented;

import java.util.ArrayList;
import java.util.List;

public class Finder {
	private List<Movie> movies = new ArrayList<Movie>();

	public Finder() {
	}

	public void findAllSelectingTo(Selector selectDirector,
			List<Movie> allSelectedMovies) {
		for (Movie currentMovie : movies) {
			if (selectDirector.isSelected(currentMovie)) {
				allSelectedMovies.add(currentMovie);
			}
		}
	}

	public void findAllAndApply(MovieAction movieAction) {
		// TODO Auto-generated method stub
		
	}
}
