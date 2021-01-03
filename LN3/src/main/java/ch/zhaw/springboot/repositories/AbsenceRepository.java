package ch.zhaw.springboot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Absence;

public interface AbsenceRepository extends JpaRepository<Absence, Long> {

}
