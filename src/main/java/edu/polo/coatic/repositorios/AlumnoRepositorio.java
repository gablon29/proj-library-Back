package edu.polo.coatic.repositorios;

import edu.polo.coatic.entidades.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepositorio extends CrudRepository<Alumno, Long>{
    
}
