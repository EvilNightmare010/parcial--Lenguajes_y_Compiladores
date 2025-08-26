package com.trabajo.parcial.repository;

import com.trabajo.parcial.model.Acosador;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositorio JPA para la entidad Acosador
// Permite realizar operaciones CRUD y consultas sobre la tabla de acosadores
public interface AcosadorRepository extends JpaRepository<Acosador, Long> {
    // Puedes agregar métodos personalizados aquí si necesitas consultas específicas
}