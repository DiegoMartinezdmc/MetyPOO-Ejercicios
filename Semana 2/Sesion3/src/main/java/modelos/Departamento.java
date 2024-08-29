package modelos;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Profesor> profesores;

    public Departamento(){
        profesores = new ArrayList<Profesor>();

    }
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
