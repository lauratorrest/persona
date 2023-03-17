package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Persona;
import com.example.demo.domain.services.PersonaSaveService;
import com.example.demo.infrastructure.dto.PersonaDto;
import com.example.demo.infrastructure.repository.PersonaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaSaveAdapter implements PersonaSaveService {

  private final PersonaRepository personaRepository;

  @Override
  public Persona save(Persona persona) {
    return buildPersona(personaRepository.save(buildPersonaDto(persona)));
  }

  private Persona buildPersona(PersonaDto persona){
    return new Persona(persona.getNombre(), persona.getApellido(), persona.getId(),
        persona.getTipoId());
  }


  private PersonaDto buildPersonaDto(Persona persona){
    return new PersonaDto(persona.getNombre(), persona.getApellido(), persona.getId(),
        persona.getTipoId());
  }
}
