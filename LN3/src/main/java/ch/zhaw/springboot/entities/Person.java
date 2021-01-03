package ch.zhaw.springboot.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String firstname;
	private String lastname;
	private long ahv;
	private String adress;
	private long number; 

	@ManyToOne
	private Team team;
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(
			name = "Person_Shift",
			joinColumns = { @JoinColumn(name = "person_id")},
			inverseJoinColumns = { @JoinColumn(name = "shift_id") }
		)
		Set<Shift> shifts = new HashSet<>();	
	

	
	public Person(String firstname, String lastname, long ahv, String adress, long number) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.ahv = ahv;
		this.adress = adress;
		this.number = number;
	}

	public Person() {

	}

	public long getId() {
		return id;
	}

	public String getLastname() {
		return lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public long getAhv() {
		return ahv;
	}

	public String getAdress() {
		return adress;
	}

	public long getNumber() {
		return number;
	}

	
}
