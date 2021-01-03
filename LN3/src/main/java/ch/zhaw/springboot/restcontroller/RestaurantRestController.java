package ch.zhaw.springboot.restcontroller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Restaurant;
import ch.zhaw.springboot.repositories.RestaurantRepository;

@RestController
@CrossOrigin
public class RestaurantRestController {
	@Autowired
	private RestaurantRepository repository;

	@RequestMapping(value = "shiftplanner/restaurants", method = RequestMethod.GET)
	public ResponseEntity<List<Restaurant>> getRestaurants() {
		List<Restaurant> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Restaurant>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Restaurant>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "shiftplanner/restaurants/{id}", method = RequestMethod.GET)
	public ResponseEntity<Restaurant> getRestaurantById(@PathVariable("id") long id) {  // getPathogenById anpassen
		Optional<Restaurant> result = this.repository.findById(id);

		if (result.isPresent()) {
			return new ResponseEntity<Restaurant>(result.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Restaurant>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "shiftplanner/restaurants", method = RequestMethod.POST)
	public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
		Restaurant result = this.repository.save(restaurant);
		return new ResponseEntity<Restaurant>(result, HttpStatus.OK);
	}
}