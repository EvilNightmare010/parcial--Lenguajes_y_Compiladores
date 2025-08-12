package com.trabajo.parcial.service;

import com.trabajo.parcial.model.Comerciante;
import com.trabajo.parcial.repository.ComercianteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

// Servicio para la gestión de comerciantes
@Service
public class ComercianteService {
    // Repositorio JPA para acceder a los datos de Comerciante
    private final ComercianteRepository comercianteRepository;

    // Constructor con inyección de dependencias
    public ComercianteService(ComercianteRepository comercianteRepository) {
        this.comercianteRepository = comercianteRepository;
    }

    // Obtiene todos los comerciantes registrados
    public List<Comerciante> findAll() {
        return comercianteRepository.findAll();
    }

    // Busca un comerciante por su id
    public Optional<Comerciante> findById(Long id) {
        return comercianteRepository.findById(id);
    }

    // Guarda o actualiza un comerciante
    public Comerciante save(Comerciante comerciante) {
        return comercianteRepository.save(comerciante);
    }

    // Elimina un comerciante por su id
    public void deleteById(Long id) {
        comercianteRepository.deleteById(id);
    }
}