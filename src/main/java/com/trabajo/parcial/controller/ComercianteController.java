package com.trabajo.parcial.controller;

import com.trabajo.parcial.model.Comerciante;
import com.trabajo.parcial.service.ComercianteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comerciantes")
public class ComercianteController {
    private final ComercianteService comercianteService;

    public ComercianteController(ComercianteService comercianteService) {
        this.comercianteService = comercianteService;
    }

    @GetMapping
    public List<Comerciante> getAll() {
        return comercianteService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Comerciante> getById(@PathVariable Long id) {
        return comercianteService.findById(id);
    }

    // Crea un nuevo comerciante
    @PostMapping
    public Comerciante create(@RequestBody Comerciante comerciante) {
        return comercianteService.save(comerciante);
    }

    // Actualiza un comerciante existente por su id
    @PutMapping("/{id}")
    public Comerciante update(@PathVariable Long id, @RequestBody Comerciante comerciante) {
        comerciante.setId(id); // Asigna id recibido al objeto para actualizar el registro correcto
        return comercianteService.save(comerciante);
    }

    // Elimina un comerciante por su id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        comercianteService.deleteById(id);
    }
}