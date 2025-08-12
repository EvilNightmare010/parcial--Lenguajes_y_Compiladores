package com.trabajo.parcial.repository;

import com.trabajo.parcial.model.Comerciante;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositorio JPA para la entidad Comerciante
// Permite realizar operaciones CRUD y consultas sobre la tabla de comerciantes
public interface ComercianteRepository extends JpaRepository<Comerciante, Long> {
    // Puedes agregar métodos personalizados aquí si necesitas consultas específicas
}