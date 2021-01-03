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

import ch.zhaw.springboot.entities.Shift;
import ch.zhaw.springboot.repositories.ShiftRepository;

@RestController
@CrossOrigin
public class ShiftRestController {
	@Autowired
	private ShiftRepository repository;

	@RequestMapping(value = "shiftplanner/shifts", method = RequestMethod.GET)
	public ResponseEntity<List<Shift>> getShifts() {
		List<Shift> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Shift>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Shift>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "shiftplanner/shifts/{id}", method = RequestMethod.GET)
	public ResponseEntity<Shift> getShiftById(@PathVariable("id") long id) {  // getPathogenById anpassen
		Optional<Shift> result = this.repository.findById(id);

		if (result.isPresent()) {
			return new ResponseEntity<Shift>(result.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Shift>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "shiftplanner/shifts", method = RequestMethod.POST)
	public ResponseEntity<Shift> createShift(@RequestBody Shift shift) {
		Shift result = this.repository.save(shift);
		return new ResponseEntity<Shift>(result, HttpStatus.OK);
	}
}