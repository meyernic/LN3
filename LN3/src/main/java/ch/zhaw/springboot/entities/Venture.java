package ch.zhaw.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Venture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String location;
	private String name;

	public Venture(String location, String name) {
		this.location = location;
		this.name = name;
	}

	public Venture() { 

	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}
}
