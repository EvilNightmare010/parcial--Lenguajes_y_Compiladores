package com.trabajo.parcial.repository;

import com.trabajo.parcial.model.MonitorEstadoAnimo;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositorio JPA para la entidad MonitorEstadoAnimo
// Permite realizar operaciones CRUD y consultas sobre la tabla de registros de estado de ánimo
public interface MonitorEstadoAnimoRepository extends JpaRepository<MonitorEstadoAnimo, Long> {
    // Puedes agregar métodos personalizados aquí si necesitas consultas específicas
}