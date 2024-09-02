package modelos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(String titulo) {
        libros.add(new Libro(titulo));
    }

    private class Libro {  // Cambié de 'libro' a 'Libro'
        private String titulo;

        public Libro(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void mostrarLibros() {
        System.out.println("Libros disponibles: ");
        for (Libro libro : libros) {
            System.out.println("- " + libro.getTitulo());
        }
        System.out.println("*".repeat(13));
    }
}
