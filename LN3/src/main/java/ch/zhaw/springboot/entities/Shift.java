package ch.zhaw.springboot.entities;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Shift {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long time;
	private long datum;
	
	@ManyToMany(mappedBy = "shifts")
	private Set<Person> persons = new HashSet<>();
	
	@ManyToOne
	private Location location;
	
	public Shift(long time, long datum, String breaks)	{
		this.time = time;
		this.datum = datum;
	}
	
	public Shift() {
		
	}

	public long getId() {
		return id;
	}

	public long getTime() {
		return time;
	}

	public long getDatum() {
		return datum;
	}
}