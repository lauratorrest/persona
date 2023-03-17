package com.example.demo.application;

import com.example.demo.domain.entities.Persona;
import com.example.demo.domain.services.PersonaSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaSave {
 private final PersonaSaveService personaSaveService;

  public Persona savePersona(Persona persona){
    return personaSaveService.save(persona);
  }
}
