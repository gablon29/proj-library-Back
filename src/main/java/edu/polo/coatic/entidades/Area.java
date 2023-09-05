package edu.polo.coatic.entidades;

import java.util.*;
import jakarta.persistence.*;
import lombok.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Area {
    @Id
    @SequenceGenerator(name = "sec_area", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_area")
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "area", fetch = FetchType.EAGER)
    private Set<Curso> cursos;

    public void agregarCurso(Curso curso) {
        this.getCursos().add(curso);
    }
    public void quitarCurso(Curso curso) {
        this.getCursos().remove(curso);
    }
}
