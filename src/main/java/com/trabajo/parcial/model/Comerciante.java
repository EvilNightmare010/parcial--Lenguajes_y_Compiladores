package com.trabajo.parcial.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comerciante {
    // Identificador único del comerciante
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Plan de venganza asociado a este comerciante
    @ManyToOne
    @JoinColumn(name = "plan_venganza_id")
    private PlanVenganza planVenganza;

    // Tipo de contenido multimedia que comercia
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    // URL del recurso multimedia
    private String url;
    // Título o descripción del recurso
    private String titulo;

    // Tipos posibles de contenido multimedia
    public enum Tipo {
        FOTO, DIBUJO, MEME, VIDEO
    }

    public void setId(Long id) {
        this.id = id;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 9c2940cace0ccc1995eb759a7180430d698bcd81
