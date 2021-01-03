package ch.zhaw.springboot.entities;

import javax.persistence.Entity;


@Entity
public class Restaurant extends Venture {
	 private long stars;
	 
	 public Restaurant(long stars) {
		 this.stars = stars;
	 }
	 
	 public Restaurant() {
		 
	 }
	 
	 public long getStars() {
		 return stars;
	 }
}

