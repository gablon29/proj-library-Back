package edu.polo.coatic.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import edu.polo.coatic.entidades.*;
import edu.polo.coatic.servicios.*;


@RestController
@RequestMapping("/curso")
public class CursoControlador {
    @Autowired
    AreaServicio areaServicio;

    @GetMapping
    public  List<Area> getAll(){
        return areaServicio.getAll();
    }

}