package com.trabajo.parcial.controller;

import com.trabajo.parcial.model.Clique;
import com.trabajo.parcial.service.CliqueService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cliques")
public class CliqueController {
    private final CliqueService cliqueService;

    public CliqueController(CliqueService cliqueService) {
        this.cliqueService = cliqueService;
    }

    @GetMapping
    public List<Clique> getAll() {
        return cliqueService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Clique> getById(@PathVariable Long id) {
        return cliqueService.findById(id);
    }

    // Crea una nueva camarilla
    @PostMapping
    public Clique create(@RequestBody Clique clique) {
        return cliqueService.save(clique);
    }

    // Actualiza una camarilla existente por su id
    @PutMapping("/{id}")
    public Clique update(@PathVariable Long id, @RequestBody Clique clique) {
        clique.setId(id); // Asigna id recibido al objeto para actualizar el registro correcto
        return cliqueService.save(clique);
    }

    // Elimina una camarilla por su id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cliqueService.deleteById(id);
    }
}