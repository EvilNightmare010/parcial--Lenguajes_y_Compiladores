package com.trabajo.parcial.controller;

import com.trabajo.parcial.model.Acosador;
import com.trabajo.parcial.service.AcosadorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/acosadores")
public class AcosadorController {
    private final AcosadorService acosadorService;

    public AcosadorController(AcosadorService acosadorService) {
        this.acosadorService = acosadorService;
    }

    @GetMapping
    public List<Acosador> getAll() {
        return acosadorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Acosador> getById(@PathVariable Long id) {
        return acosadorService.findById(id);
    }

    @PostMapping
    public Acosador create(@RequestBody Acosador acosador) {
        return acosadorService.save(acosador);
    }

    @PutMapping("/{id}")
    public Acosador update(@PathVariable Long id, @RequestBody Acosador acosador) {
        acosador.setId(id);
        return acosadorService.save(acosador);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        acosadorService.deleteById(id);
    }
}