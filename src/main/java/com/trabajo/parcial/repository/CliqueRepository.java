package com.trabajo.parcial.repository;

import com.trabajo.parcial.model.Clique;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositorio JPA para la entidad Clique
// Permite realizar operaciones CRUD y consultas sobre la tabla de camarillas
public interface CliqueRepository extends JpaRepository<Clique, Long> {
    // Puedes agregar métodos personalizados aquí si necesitas consultas específicas
}