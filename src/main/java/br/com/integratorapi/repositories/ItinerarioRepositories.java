package br.com.integratorapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import br.com.integratorapi.domain.Itinerario;

@Repository
public interface ItinerarioRepositories extends JpaRepository<Itinerario, Long> {
	
}
