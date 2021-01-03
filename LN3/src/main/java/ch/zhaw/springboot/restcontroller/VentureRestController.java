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

import ch.zhaw.springboot.entities.Venture;
import ch.zhaw.springboot.repositories.VentureRepository;

@RestController
@CrossOrigin
public class VentureRestController {
	@Autowired
	private VentureRepository repository;

	@RequestMapping(value = "shiftplanner/ventures", method = RequestMethod.GET)
	public ResponseEntity<List<Venture>> getVentures() {
		List<Venture> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Venture>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Venture>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "shiftplanner/ventures/{id}", method = RequestMethod.GET)
	public ResponseEntity<Venture> getVentureById(@PathVariable("id") long id) {
		Optional<Venture> result = this.repository.findById(id);

		if (result.isPresent()) {
			return new ResponseEntity<Venture>(result.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Venture>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "shiftplanner/ventures", method = RequestMethod.POST)
	public ResponseEntity<Venture> createVenture(@RequestBody Venture venture) {
		Venture result = this.repository.save(venture);
		return new ResponseEntity<Venture>(result, HttpStatus.OK);
	}
}
