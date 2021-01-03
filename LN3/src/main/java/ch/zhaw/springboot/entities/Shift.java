package ch.zhaw.springboot.entities;


import java.sql.Date;
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
	
	private long duration;
	private Date datum;
	
	@ManyToMany(mappedBy = "shifts")
	private Set<Person> persons = new HashSet<>();
	
	@ManyToOne
	private Venture venture;
	
	public Shift(long duration, Date datum)	{
		this.duration = duration;
		this.datum = datum;
	}
	
	public Shift() {
		
	}

	public long getId() {
		return id;
	}

	public long getDuration() {
		return duration;
	}

	public Date getDatum() {
		return datum;
	}
}