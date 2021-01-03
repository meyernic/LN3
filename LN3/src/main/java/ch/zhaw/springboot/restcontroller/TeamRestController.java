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

import ch.zhaw.springboot.entities.Team;
import ch.zhaw.springboot.repositories.TeamRepository;

@RestController
@CrossOrigin
public class TeamRestController {
	@Autowired
	private TeamRepository repository;

	@RequestMapping(value = "shiftplanner/teams", method = RequestMethod.GET)
	public ResponseEntity<List<Team>> getTeams() {
		List<Team> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Team>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Team>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "shiftplanner/teams/{id}", method = RequestMethod.GET)
	public ResponseEntity<Team> getPathogenById(@PathVariable("id") long id) {  // Pathogen anpassen
		Optional<Team> result = this.repository.findById(id); 

		if (result.isPresent()) {
			return new ResponseEntity<Team>(result.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Team>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "shiftplanner/teams", method = RequestMethod.POST)
	public ResponseEntity<Team> createTeam(@RequestBody Team team) {
		Team result = this.repository.save(team);
		return new ResponseEntity<Team>(result, HttpStatus.OK);
	}
}
