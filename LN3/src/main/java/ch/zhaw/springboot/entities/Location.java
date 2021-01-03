package ch.zhaw.springboot.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String location;
	private String name;
	private long capacity;
	
	public Location(String location, String name, long capacity) {
		this.location = location;
		this.name = name;
		this.capacity = capacity;
	}
	
	public Location() {
		
	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public long getCapacity() {
		return capacity;
	}	
}
	
	
