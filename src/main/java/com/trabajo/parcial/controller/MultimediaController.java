package com.trabajo.parcial.controller;

import com.trabajo.parcial.model.Multimedia;
import com.trabajo.parcial.service.MultimediaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/multimedia")
public class MultimediaController {
    private final MultimediaService multimediaService;

    public MultimediaController(MultimediaService multimediaService) {
        this.multimediaService = multimediaService;
    }

    // Obtiene todos los registros multimedia
    @GetMapping
    public List<Multimedia> getAll() {
        return multimediaService.findAll();
    }

    // Obtiene un registro multimedia por su id
    @GetMapping("/{id}")
    public Optional<Multimedia> getById(@PathVariable Long id) {
        return multimediaService.findById(id);
    }

    @PostMapping
    public Multimedia create(@RequestBody Multimedia multimedia) {
        return multimediaService.save(multimedia);
    }

    @PutMapping("/{id}")
    public Multimedia update(@PathVariable Long id, @RequestBody Multimedia multimedia) {
        multimedia.setId(id);
        return multimediaService.save(multimedia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        multimediaService.deleteById(id);
    }
}