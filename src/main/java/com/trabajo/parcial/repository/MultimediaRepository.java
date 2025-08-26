package com.trabajo.parcial.repository;

import com.trabajo.parcial.model.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositorio JPA para la entidad Multimedia
// Permite realizar operaciones CRUD y consultas sobre la tabla de registros multimedia
public interface MultimediaRepository extends JpaRepository<Multimedia, Long> {
    // Puedes agregar métodos personalizados aquí si necesitas consultas específicas
}