package com.trabajo.parcial.service;

import com.trabajo.parcial.model.Multimedia;
import com.trabajo.parcial.repository.MultimediaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

// Servicio para la gestión de registros multimedia
@Service
public class MultimediaService {
    // Repositorio JPA para acceder a los datos de Multimedia
    private final MultimediaRepository multimediaRepository;

    // Constructor con inyección de dependencias
    public MultimediaService(MultimediaRepository multimediaRepository) {
        this.multimediaRepository = multimediaRepository;
    }

    // Obtiene todos los registros multimedia
    public List<Multimedia> findAll() {
        return multimediaRepository.findAll();
    }

    // Busca un registro multimedia por su id
    public Optional<Multimedia> findById(Long id) {
        return multimediaRepository.findById(id);
    }

    // Guarda o actualiza un registro multimedia
    public Multimedia save(Multimedia multimedia) {
        return multimediaRepository.save(multimedia);
    }

    // Elimina un registro multimedia por su id
    public void deleteById(Long id) {
        multimediaRepository.deleteById(id);
    }
}