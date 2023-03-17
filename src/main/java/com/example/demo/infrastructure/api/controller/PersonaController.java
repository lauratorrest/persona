package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.PersonaGet;
import com.example.demo.application.PersonaSave;
import com.example.demo.domain.entities.Persona;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/persona")
public class PersonaController {
  private final PersonaSave personaSave;
  private final PersonaGet personaGet;

  //Create
  @PostMapping
  public ResponseEntity<Persona> createPersona(@RequestBody Persona persona){
    return new ResponseEntity<>(personaSave.savePersona(persona), HttpStatus.CREATED);
  }

  //Read
  @GetMapping()
  public ResponseEntity<Persona> getPersona(@RequestParam String id){
    return ResponseEntity.ok(personaGet.getPersona(id));
  }

  @GetMapping(value = "/todos")
  public ResponseEntity<List<Persona>> getAllPersonas(){
    return ResponseEntity.ok(personaGet.getListPersona());
  }
}
