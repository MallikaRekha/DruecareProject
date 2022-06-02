package io.javabrains.moviecatalogservice.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.WebResourceRoot.ResourceSetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.javabrains.moviecatalogservice.Entity.CatalogItem;
//import io.javabrains.movieratingservice.entity.Rating;


@RestController
@RequestMapping("/Catalog")
public class MovieCatalogueController {

	@Autowired
	RestTemplate restTemplate;
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

		//RestTemplate restTemplate = new RestTemplate();

		userRating ratings =  restTemplate.getForObject("http://localhost:8081/ratingsdata/users/" + userId,userRating.class
			);
		//      ratingList.stream().map(rating ->
		//	new CatalogItem("avenger",
		//			"saving the world", 4)
		//).Collect(Collectors.toList());
		//      

		//return ratingList.stream()
		return ratings.getUserRating().stream()
				.map(rating -> {
					//For Each Movie Id,call Movie info service and get details
					Movie movie = restTemplate.getForObject("http://localhost:8081/movies/4", Movie.class);
					//put them all together					
					return new CatalogItem(movie.getName(),"aliens description",rating.getRating());
				})
				.collect(Collectors.toList());
	}
}
/*Movie movie=WebClientBuilder.build()
.get()
.retrieve()
.bodyToMono(Movie.class)
.block();
*/