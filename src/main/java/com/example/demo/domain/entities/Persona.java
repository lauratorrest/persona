package com.example.demo.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Persona {
 private String nombre;
 private String apellido;
 private String id;
 private String tipoId;

  public Persona(String nombre, String apellido, String id, String tipoId) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.id = id;
    this.tipoId = tipoId;
  }
}
