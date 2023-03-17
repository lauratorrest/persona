package com.example.demo.domain.services;

import com.example.demo.domain.entities.Persona;
import java.util.List;

public interface PersonaGetService {
  Persona getPersona(String id);
  List<Persona> getListPersonas();
}
