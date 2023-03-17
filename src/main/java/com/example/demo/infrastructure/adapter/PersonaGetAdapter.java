package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Persona;
import com.example.demo.domain.services.PersonaGetService;
import com.example.demo.infrastructure.dto.PersonaDto;
import com.example.demo.infrastructure.mapper.PersonaMapper;
import com.example.demo.infrastructure.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaGetAdapter implements PersonaGetService {
  private final PersonaRepository personaRepository;
  private final PersonaMapper personaMapper;

  @Override
  public Persona getPersona(String id){
    Optional<PersonaDto> personaDto = personaRepository.findById(id);

    return personaDto.map(this::buildPersona).orElse(null);

  }

  @Override
  public List<Persona> getListPersonas() {
    List<PersonaDto> personasDto = personaRepository.findAll();
    return personasDto.stream().map(personaMapper::toPersonaEntity).toList();
  }


  private Persona buildPersona(PersonaDto persona){
    return new Persona(persona.getNombre(),persona.getApellido(), persona.getId(),
        persona.getTipoId());
  }
}
