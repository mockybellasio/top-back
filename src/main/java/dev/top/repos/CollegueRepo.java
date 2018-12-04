package dev.top.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.top.entities.Collegue;

public interface CollegueRepo extends JpaRepository<Collegue, Integer> {

	Collegue findByPseudo(String pseudo);

	List<Collegue> findAll();

}


