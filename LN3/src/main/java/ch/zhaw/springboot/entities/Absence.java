package ch.zhaw.springboot.entities;


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
	
	private long startdate;
	private long enddate;
	private String reason;
	
	@ManyToOne
	private Person person;
	
	public Absence(long startdate, long enddate, String reason) {
		this.startdate = startdate;
		this.enddate = enddate;
		this.reason = reason;
	}
	
	public Absence() {
		
	}

	public long getStartdate() {
		return startdate;
	}

	public long getEnddate() {
		return enddate;
	}

	public String getReason() {
		return reason;
	}	
}
