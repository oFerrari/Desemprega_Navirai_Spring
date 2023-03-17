package br.edu.ifms.matricula.model.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.matricula.model.entities.Estudante;

//CREATE TABLE E INSERTS AUTOMATICOS

public interface EstudanteRepository extends JpaRepository<Estudante, UUID>{
	
}	
