package com.sinfloo.ejemplo01;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

        List<Persona> listar();
        Optional<Persona> listarId(int id);
        Persona add(Persona p);
        Persona edit(Persona p);
        Persona delete(int id);


}
