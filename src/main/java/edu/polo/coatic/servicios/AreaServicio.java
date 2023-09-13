package edu.polo.coatic.servicios;
import edu.polo.coatic.entidades.*;
import edu.polo.coatic.repositorios.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class AreaServicio {
    
    @Autowired
    AreaRepositorio areaRepositorio;

    public List<Area> getAll() {
        List<Area> lista = new ArrayList<Area>();
        areaRepositorio.findAll().forEach(registro -> lista.add(registro));
        return lista;
    }
    public Area getById(Long id) {
        return areaRepositorio.findById(id).get();
    }

    public void save(Area area) {
        areaRepositorio.save(area);
    }
    public void delete(Long id) {
        areaRepositorio.deleteById(id);
    }
}
