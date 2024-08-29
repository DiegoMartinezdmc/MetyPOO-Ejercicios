package modelos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(string titulo){
        libros.add(new Libro(titulo));
    }

    private class libro{
        private String titulo;

        public libro(){}

        public libro(String titulo){
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }
    }

    public List<libro> getLibros() {
        return libro;
    }

    public void mostrarLibros(){
        System.out.println("Libros disponibles: ");
        for (Libro libro : libros){
            System.out.println("-" + libro.getTitulo());
        }
        System.out.println("*".repeat(13));
    }
}
