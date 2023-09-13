package edu.polo.coatic.repositorios; 
// este repositorio sera la interfaz que nos conecte el objeto
// Area con la base de datos

import edu.polo.coatic.entidades.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // anotacion
//                                                      objeto  id
public interface AreaRepositorio extends CrudRepository <Area, Long> {
    
}