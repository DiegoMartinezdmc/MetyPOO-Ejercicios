import modelos.Profesor;
import modelos.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Curso curso = new Curso( "Metodologia y Programacion Orientada a Objetos");
        Profesor dimitrick = new Profesor("Dimitrick Navarro");
        dimitrick.enseñar(curso);
        Departamento fia = new Departamento();
        fia.setNombre("FIA");
        Profesor noel = new Profesor("Noel Gavarrete");
        fia.agregarProfesor(noel);
        fia.agregarProfesor(dimitrick);
        System.out.println(fia.getNombre());
        for(Profesor doc : fia.getProfesores()) {
            System.out.println(doc.getNombre());
            System.out.println("=".repeat(13));
        }
    }

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.agregarLibro("Introduccion a las bases de datos");
    bibl
}
