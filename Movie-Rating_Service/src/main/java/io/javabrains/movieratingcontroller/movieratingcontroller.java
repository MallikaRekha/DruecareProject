package io.javabrains.movieratingcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import io.javabrains.moviecatalogservice.controller.Rating;



@RestController
@RequestMapping("/ratingsdata")

public class movieratingcontroller {
	@RestController
	@RequestMapping("/movies")
	public class movieinfocontroller {
		
		 @RequestMapping("/{movieId}")   
		    public Rating getRating(@PathVariable("movieId") String movieId) {
		            return  new Rating(movieId,4);
		        }
		 @RequestMapping("users/{userId}")   
		    //public List<Rating> getuserRating(@PathVariable("userId") String userId)
		    public userRating getuserRating(@PathVariable("userId") String userId){
			 List<Rating>ratings =  Arrays.asList(new Rating("123",4),
						new Rating("567",3));
		        
		 //return ratings;
			 userRating userRating=new userRating();
			 userRating.setUserRating(ratings);
			 return userRating;
		 }

}
}
