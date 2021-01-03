package ch.zhaw.springboot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
