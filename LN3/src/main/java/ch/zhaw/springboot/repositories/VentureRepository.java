package ch.zhaw.springboot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Venture;

public interface VentureRepository extends JpaRepository<Venture, Long> {

}
