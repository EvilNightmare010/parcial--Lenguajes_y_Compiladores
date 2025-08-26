package com.trabajo.parcial.controller;

import com.trabajo.parcial.model.PlanVenganza;
import com.trabajo.parcial.service.PlanVenganzaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/planes-venganza")
public class PlanVenganzaController {
    private final PlanVenganzaService planVenganzaService;

    public PlanVenganzaController(PlanVenganzaService planVenganzaService) {
        this.planVenganzaService = planVenganzaService;
    }

    // Obtiene todos los planes de venganza
    @GetMapping
    public List<PlanVenganza> getAll() {
        return planVenganzaService.findAll();
    }

    // Obtiene un plan de venganza por su id
    @GetMapping("/{id}")
    public Optional<PlanVenganza> getById(@PathVariable Long id) {
        return planVenganzaService.findById(id);
    }

    // Crea un nuevo plan de venganza
    @PostMapping
    public PlanVenganza create(@RequestBody PlanVenganza planVenganza) {
        return planVenganzaService.save(planVenganza);
    }

    // Actualiza un plan de venganza existente por su id
    @PutMapping("/{id}")
    public PlanVenganza update(@PathVariable Long id, @RequestBody PlanVenganza planVenganza) {
        planVenganza.setId(id); // Asigna id recibido al objeto para actualizar el registro correcto
        return planVenganzaService.save(planVenganza);
    }

    // Elimina un plan de venganza por su id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        planVenganzaService.deleteById(id);
    }
}