package com.trabajo.parcial.repository;

import com.trabajo.parcial.model.PlanVenganza;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositorio JPA para la entidad PlanVenganza
// Permite realizar operaciones CRUD y consultas sobre la tabla de planes de venganza
public interface PlanVenganzaRepository extends JpaRepository<PlanVenganza, Long> {
    // Puedes agregar métodos personalizados aquí si necesitas consultas específicas
}