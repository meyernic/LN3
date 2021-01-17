package ch.zhaw.springboot.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Absence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String startdate;
	private String enddate;
	private String reason;
	
	@ManyToOne
	private Person person;
	
	public Absence(String startdate, String enddate, String reason) {
		this.startdate = startdate;
		this.enddate = enddate;
		this.reason = reason;
	}
	
	public Absence() {
		
	}

	public String getStartdate() {
		return startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public String getReason() {
		return reason;
	}	
}
