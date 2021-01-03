package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Foodtruck;

public interface FoodtruckRepository extends JpaRepository<Foodtruck, Long> {

}
