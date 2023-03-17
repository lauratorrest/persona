package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.PersonaDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaDto, String> {

}
