package ch.zhaw.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String description;
	
	public Team(String description) {
		this.description = description;	
	}
	
	public Team() {
	}

	public String getDescription() {
		return description;
	}

	public long getId() {
		return id;
	}	
}
