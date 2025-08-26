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

<<<<<<< HEAD
=======
    // Crea un nuevo acosador
>>>>>>> 9c2940cace0ccc1995eb759a7180430d698bcd81
    @PostMapping
    public Acosador create(@RequestBody Acosador acosador) {
        return acosadorService.save(acosador);
    }

<<<<<<< HEAD
    @PutMapping("/{id}")
    public Acosador update(@PathVariable Long id, @RequestBody Acosador acosador) {
        acosador.setId(id);
        return acosadorService.save(acosador);
    }

=======
    // Actualiza un acosador existente por su id
    @PutMapping("/{id}")
    public Acosador update(@PathVariable Long id, @RequestBody Acosador acosador) {
        acosador.setId(id); // Asigna el id recibido al objeto para actualizar el registro correcto
        return acosadorService.save(acosador);
    }

    // Elimina un acosador por su id
>>>>>>> 9c2940cace0ccc1995eb759a7180430d698bcd81
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        acosadorService.deleteById(id);
    }
}