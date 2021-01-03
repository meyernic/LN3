package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
