package com.trabajo.parcial.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MonitorEstadoAnimo {
    // Identificador único del registro de estado de ánimo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Fecha en la que se registra el estado de ánimo
    private LocalDate fecha;
    // Nivel de estado de ánimo (1-10)
    private int nivelDeMood;
    // Nota o reflexión escrita por el usuario
    private String nota;

    // Permite actualizar el id del registro
    public void setId(Long id) {
        this.id = id;
    }
}