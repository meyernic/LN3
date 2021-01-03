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

import ch.zhaw.springboot.entities.Foodtruck;
import ch.zhaw.springboot.repositories.FoodtruckRepository;

@RestController
@CrossOrigin
public class FoodtruckRestController {
	@Autowired
	private FoodtruckRepository repository;

	@RequestMapping(value = "shiftplanner/foodtrucks", method = RequestMethod.GET)
	public ResponseEntity<List<Foodtruck>> getFoodtrucks() {
		List<Foodtruck> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Foodtruck>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Foodtruck>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "shiftplanner/foodtrucks/{id}", method = RequestMethod.GET)
	public ResponseEntity<Foodtruck> getFoodtruckById(@PathVariable("id") long id) {
		Optional<Foodtruck> result = this.repository.findById(id);

		if (result.isPresent()) {
			return new ResponseEntity<Foodtruck>(result.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Foodtruck>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "shiftplanner/foodtrucks", method = RequestMethod.POST)
	public ResponseEntity<Foodtruck> createFoodtruck(@RequestBody Foodtruck foodtruck) {
		Foodtruck result = this.repository.save(foodtruck);
		return new ResponseEntity<Foodtruck>(result, HttpStatus.OK);
	}
}
