package com.trabajo.parcial.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Multimedia {
    // Identificador único del registro multimedia
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Plan de venganza al que está asociado este registro multimedia
    @ManyToOne
    @JoinColumn(name = "plan_venganza_id")
    private PlanVenganza planVenganza;

    // Tipo de multimedia (foto, dibujo, meme, video)
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    // URL del recurso multimedia
    private String url;
    // Título o descripción del recurso
    private String titulo;

    // Tipos posibles de multimedia
    public enum Tipo {
        FOTO, DIBUJO, MEME, VIDEO
    }

    public void setId(Long id) {
        this.id = id;
    }
}