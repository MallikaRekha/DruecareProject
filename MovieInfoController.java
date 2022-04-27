package io.javabrains.movieinfoservice.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.movieinfoservice.entity.Movie;

@RestController
public class MovieInfoController {
	
	@RequestMapping("/movies/{movieId}")
	public List<Movie> getMovieInfo(@PathVariable String movieId){
		return Collections.singletonList(new Movie("548",
				"thor"));
	}
	
}