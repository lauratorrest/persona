package com.example.demo.application;

import com.example.demo.domain.entities.Persona;
import com.example.demo.domain.services.PersonaGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaGet {
  private final PersonaGetService personaGetService;

  public Persona getPersona(String id){return personaGetService.getPersona(id);}

  public List<Persona> getListPersona(){return personaGetService.getListPersonas();}
}
