package edu.polo.coatic.repositorios; 
// este repositorio sera la interfaz que nos conecte el objeto
// Area con la base de datos

import edu.polo.coatic.entidades.*; // entidades de la base de datos
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository; // Proporcion de metodos CRUD
import org.springframework.stereotype.Repository; // indicamos que la clase es un componente de repositorio y debe ser administrada por el contenedor de Spring

@Repository // anotacion
//                                                      objeto  id
public interface AreaRepositorio extends CrudRepository <Area, Long> {
    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Curso c WHERE c.area.id = ?1")
    boolean hasReferences(Long id);
}