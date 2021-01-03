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

import ch.zhaw.springboot.entities.Absence;
import ch.zhaw.springboot.repositories.AbsenceRepository;

@RestController
@CrossOrigin
public class AbsenceRestController {
	@Autowired
	private AbsenceRepository repository;

	@RequestMapping(value = "shiftplanner/absences", method = RequestMethod.GET)
	public ResponseEntity<List<Absence>> getAbsences() {
		List<Absence> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Absence>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Absence>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "shiftplanner/absences/{id}", method = RequestMethod.GET)
	public ResponseEntity<Absence> getAbsenceById(@PathVariable("id") long id) {  // Pathogen anpassen
		Optional<Absence> result = this.repository.findById(id); 

		if (result.isPresent()) {
			return new ResponseEntity<Absence>(result.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Absence>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "shiftplanner/absences", method = RequestMethod.POST)
	public ResponseEntity<Absence> createAbsences(@RequestBody Absence absence) {
		Absence result = this.repository.save(absence);
		return new ResponseEntity<Absence>(result, HttpStatus.OK);
	}
}
