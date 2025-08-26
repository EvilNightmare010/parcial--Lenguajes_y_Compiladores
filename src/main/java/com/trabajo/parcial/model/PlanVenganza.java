package com.trabajo.parcial.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanVenganza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "acosador_id")
    private Acosador acosador;

    private boolean seEjecuta;
    private LocalDate fechaPlanificada;

    @Enumerated(EnumType.STRING)
    private NivelExito nivelExito;

    @OneToMany(mappedBy = "planVenganza", cascade = CascadeType.ALL)
    private List<Multimedia> multimedia;

    public enum NivelExito {
        FALLO_EPICO, LIGERO_DIVERTIDO, ICONICO
    }

    public void setId(Long id) {
        this.id = id;
    }
}
