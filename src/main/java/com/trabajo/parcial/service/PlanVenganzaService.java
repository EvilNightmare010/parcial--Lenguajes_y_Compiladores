package com.trabajo.parcial.service;

import com.trabajo.parcial.model.PlanVenganza;
import com.trabajo.parcial.repository.PlanVenganzaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

// Servicio para la gestión de planes de venganza
@Service
public class PlanVenganzaService {
    // Repositorio JPA para acceder a los datos de PlanVenganza
    private final PlanVenganzaRepository planVenganzaRepository;

    // Constructor con inyección de dependencias
    public PlanVenganzaService(PlanVenganzaRepository planVenganzaRepository) {
        this.planVenganzaRepository = planVenganzaRepository;
    }

    // Obtiene todos los planes de venganza registrados
    public List<PlanVenganza> findAll() {
        return planVenganzaRepository.findAll();
    }

    // Busca un plan de venganza por su id
    public Optional<PlanVenganza> findById(Long id) {
        return planVenganzaRepository.findById(id);
    }

    // Guarda o actualiza un plan de venganza
    public PlanVenganza save(PlanVenganza planVenganza) {
        return planVenganzaRepository.save(planVenganza);
    }

    // Elimina un plan de venganza por su id
    public void deleteById(Long id) {
        planVenganzaRepository.deleteById(id);
    }
}