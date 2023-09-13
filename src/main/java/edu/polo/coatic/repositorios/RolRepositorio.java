package edu.polo.coatic.repositorios;

import edu.polo.coatic.entidades.*;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepositorio extends CrudRepository<Rol, Long>{
    Optional<Rol> findByNombre(String string);
}