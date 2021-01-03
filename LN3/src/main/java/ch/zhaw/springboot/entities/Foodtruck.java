package ch.zhaw.springboot.entities;

import javax.persistence.Entity;


@Entity
public class Foodtruck extends Venture {
	 private long autonr;
	 
	 public Foodtruck(long autonr) {
		 this.autonr = autonr;
	 }
	 
	 public Foodtruck() {
		 
	 }
	 
	 public long getAutonr() {
		 return autonr;
	 }
}

