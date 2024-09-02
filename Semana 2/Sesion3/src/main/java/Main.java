import modelos.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Curso curso = new Curso("Metodología y Programación Orientada a Objetos");
        Profesor dimitrick = new Profesor("Dimitrick Navarro");
        Profesor noel = new Profesor("Noel Gavarrete");
        dimitrick.ensenarCurso(curso);

        Departamento fia = new Departamento();
        fia.setNombre("FIA");
        fia.agregarProfesor(noel);
        fia.agregarProfesor(dimitrick);

        System.out.println(fia.getNombre());
        System.out.println("=".repeat(13));
        for (Profesor doc : fia.getProfesores()) {
            System.out.println(doc.getNombre());
            System.out.println("=".repeat(13));
        }

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro("Introducción a las bases de datos");
        biblioteca.agregarLibro("Cómo programar en Python");

        biblioteca.mostrarLibros();

        Perro elPerro = new Perro();
        elPerro.setNombre("Atomic Bomb");
        System.out.print(elPerro.getNombre() + " hace ");
        elPerro.hacerSonido();
    }
}
