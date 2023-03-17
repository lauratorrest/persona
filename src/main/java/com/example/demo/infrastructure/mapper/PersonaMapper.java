package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.entities.Persona;
import com.example.demo.infrastructure.dto.PersonaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonaMapper {
  Persona toPersonaEntity(PersonaDto personaDto);

  @Mapping(target="nombre", source="nombre")
  @Mapping(target="apellido", source="apellido")
  @Mapping(target="id", source="id")
  @Mapping(target="tipoId", source="tipoId")
  PersonaDto toDto(Persona persona);

  Persona toEntity(PersonaDto personaDto);
}
