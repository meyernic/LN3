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

import ch.zhaw.springboot.entities.Location;
import ch.zhaw.springboot.repositories.LocationRepository;

@RestController
@CrossOrigin
public class LocationRestController {
	@Autowired
	private LocationRepository repository;

	@RequestMapping(value = "shiftplanner/locations", method = RequestMethod.GET)
	public ResponseEntity<List<Location>> getLocations() {
		List<Location> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Location>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Location>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "shiftplanner/locations/{id}", method = RequestMethod.GET)
	public ResponseEntity<Location> getPathogenById(@PathVariable("id") long id) { // getPathogenById anpassen
		Optional<Location> result = this.repository.findById(id);

		if (result.isPresent()) {
			return new ResponseEntity<Location>(result.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Location>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "shiftplanner/locations", method = RequestMethod.POST)
	public ResponseEntity<Location> createLocation(@RequestBody Location location) {
		Location result = this.repository.save(location);
		return new ResponseEntity<Location>(result, HttpStatus.OK);
	}
}
