package com.trabajo.parcial.controller;

import com.trabajo.parcial.model.MonitorEstadoAnimo;
import com.trabajo.parcial.service.MonitorEstadoAnimoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/monitor-estado-animo")
public class MonitorEstadoAnimoController {
    private final MonitorEstadoAnimoService monitorEstadoAnimoService;

    public MonitorEstadoAnimoController(MonitorEstadoAnimoService monitorEstadoAnimoService) {
        this.monitorEstadoAnimoService = monitorEstadoAnimoService;
    }

    // Obtiene todos los registros de estado de ánimo
    @GetMapping
    public List<MonitorEstadoAnimo> getAll() {
        return monitorEstadoAnimoService.findAll();
    }

    // Obtiene un registro de estado de ánimo por su id
    @GetMapping("/{id}")
    public Optional<MonitorEstadoAnimo> getById(@PathVariable Long id) {
        return monitorEstadoAnimoService.findById(id);
    }

    // Crea un nuevo registro de estado de ánimo
    @PostMapping
    public MonitorEstadoAnimo create(@RequestBody MonitorEstadoAnimo monitorEstadoAnimo) {
        return monitorEstadoAnimoService.save(monitorEstadoAnimo);
    }

    // Actualiza un registro de estado de ánimo existente por su id
    @PutMapping("/{id}")
    public MonitorEstadoAnimo update(@PathVariable Long id, @RequestBody MonitorEstadoAnimo monitorEstadoAnimo) {
        monitorEstadoAnimo.setId(id); // Asigna id recibido al objeto para actualizar el registro correcto
        return monitorEstadoAnimoService.save(monitorEstadoAnimo);
    }

    // Elimina un registro de estado de ánimo por su id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        monitorEstadoAnimoService.deleteById(id);
    }
}