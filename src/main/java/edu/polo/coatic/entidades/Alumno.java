package edu.polo.coatic.entidades;

import java.util.*;
import jakarta.persistence.*;
import lombok.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Alumno {
    @Id
    // @SequenceGenerator(name = "sec_alumno", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)
    private Set<Curso> cursos;

    public void agregarCurso(Curso curso) {
        this.getCursos().add(curso);
    }
}
