package com.trabajo.parcial.service;

import com.trabajo.parcial.model.Acosador;
import com.trabajo.parcial.repository.AcosadorRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

// Servicio para la gestión de Acosadores
@Service
public class AcosadorService {
    // Repositorio JPA para acceder a los datos de Acosador
    private final AcosadorRepository acosadorRepository;

    // Constructor con inyección de dependencias
    public AcosadorService(AcosadorRepository acosadorRepository) {
        this.acosadorRepository = acosadorRepository;
    }

    // Obtiene todos los acosadores registrados
    public List<Acosador> findAll() {
        return acosadorRepository.findAll();
    }

    // Busca un acosador por su id
    public Optional<Acosador> findById(Long id) {
        return acosadorRepository.findById(id);
    }

    // Guarda o actualiza un acosador
    public Acosador save(Acosador acosador) {
        return acosadorRepository.save(acosador);
    }

    // Elimina un acosador por su id
    public void deleteById(Long id) {
        acosadorRepository.deleteById(id);
    }
}