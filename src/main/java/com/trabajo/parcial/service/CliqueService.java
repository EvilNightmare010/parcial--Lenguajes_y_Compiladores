package com.trabajo.parcial.service;

import com.trabajo.parcial.model.Clique;
import com.trabajo.parcial.repository.CliqueRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

// Servicio para la gestión de camarillas (Clique)
@Service
public class CliqueService {
    // Repositorio JPA para acceder a los datos de Clique
    private final CliqueRepository cliqueRepository;

    // Constructor con inyección de dependencias
    public CliqueService(CliqueRepository cliqueRepository) {
        this.cliqueRepository = cliqueRepository;
    }

    // Obtiene todas las camarillas registradas
    public List<Clique> findAll() {
        return cliqueRepository.findAll();
    }

    // Busca una camarilla por su id
    public Optional<Clique> findById(Long id) {
        return cliqueRepository.findById(id);
    }

    // Guarda o actualiza una camarilla
    public Clique save(Clique clique) {
        return cliqueRepository.save(clique);
    }

    // Elimina una camarilla por su id
    public void deleteById(Long id) {
        cliqueRepository.deleteById(id);
    }
}