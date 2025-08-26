package com.trabajo.parcial.service;

import com.trabajo.parcial.model.MonitorEstadoAnimo;
import com.trabajo.parcial.repository.MonitorEstadoAnimoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

// Servicio para la gestión de registros de estado de ánimo
@Service
public class MonitorEstadoAnimoService {
    // Repositorio JPA para acceder a los datos de MonitorEstadoAnimo
    private final MonitorEstadoAnimoRepository monitorEstadoAnimoRepository;

    // Constructor con inyección de dependencias
    public MonitorEstadoAnimoService(MonitorEstadoAnimoRepository monitorEstadoAnimoRepository) {
        this.monitorEstadoAnimoRepository = monitorEstadoAnimoRepository;
    }

    // Obtiene todos los registros de estado de ánimo
    public List<MonitorEstadoAnimo> findAll() {
        return monitorEstadoAnimoRepository.findAll();
    }

    // Busca un registro de estado de ánimo por su id
    public Optional<MonitorEstadoAnimo> findById(Long id) {
        return monitorEstadoAnimoRepository.findById(id);
    }

    // Guarda o actualiza un registro de estado de ánimo
    public MonitorEstadoAnimo save(MonitorEstadoAnimo monitorEstadoAnimo) {
        return monitorEstadoAnimoRepository.save(monitorEstadoAnimo);
    }

    // Elimina un registro de estado de ánimo por su id
    public void deleteById(Long id) {
        monitorEstadoAnimoRepository.deleteById(id);
    }
}