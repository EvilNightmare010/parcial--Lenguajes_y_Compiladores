package com.trabajo.parcial.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Clique {
    // Identificador único de la camarilla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre de la camarilla o grupo
    private String nombre;
    // Descripción de la camarilla
    private String descripcion;

    @OneToMany(mappedBy = "grupo", cascade = CascadeType.ALL)
    private List<Acosador> acosadores;

    public void setId(Long id) {
        this.id = id;
    }
}