package com.trabajo.parcial.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Acosador {
    // Identificador único del acosador
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre real del acosador
    private String nombre;
    // Apodo del acosador en el instituto
    private String apodo;

    // Rol que tenía el acosador en el instituto
    @Enumerated(EnumType.STRING)
    private HighSchoolRole highSchoolRole;

    // Grupo o camarilla al que pertenece el acosador
    @ManyToOne
    @JoinColumn(name = "grupo_id")
    private Clique grupo;

    // Motivo del bullying
    private String bullyingReason;
    // Nivel de molestia causado (1-10)
    private int levelOfAnnoyance;

    // Lista de planes de venganza asociados a este acosador
    @OneToMany(mappedBy = "acosador", cascade = CascadeType.ALL)
    private List<PlanVenganza> planesVenganza;

    // Enumeración de roles típicos en el instituto
    public enum HighSchoolRole {
        JOCK, GOSSIP, NERD_HATER, TEACHER_PET, OTRO
    }

    public void setId(Long id) {
        this.id = id;
    }
}