package edu.polo.coatic.entidades;

import java.util.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Curso {
    @Id
    // @SequenceGenerator(name = "sec_curso", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int meses;

    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date inicio;

    private boolean presencial;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Area area;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "alumno_curso", joinColumns = @JoinColumn(name = "curso_id"), inverseJoinColumns = @JoinColumn(name = "alumno_id"))

    private Set<Alumno> alumnos;

    public void agregarAlumno(Alumno alumno) {
        this.getAlumnos().add(alumno);
    }
}
