package ch.zhaw.springboot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Shift;

public interface ShiftRepository extends JpaRepository<Shift, Long> {

}
