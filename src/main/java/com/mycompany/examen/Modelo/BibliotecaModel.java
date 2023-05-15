
package com.mycompany.examen.Modelo;
import java.util.ArrayList;
import java.util.List;


public class BibliotecaModel {
    private List<Libro> libros;

    public BibliotecaModel() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(String titulo, String autor) {
        Libro nuevoLibro = new Libro(titulo, autor);
        libros.add(nuevoLibro);
    }

    public List<Libro> buscarLibrosPorTitulo(String titulo) {
        List<Libro> librosEncontrados = new ArrayList<>();

        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                librosEncontrados.add(libro);
            }
        }

        return librosEncontrados;
    }

    public void actualizarDisponibilidad(String titulo, boolean disponible) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.setDisponible(disponible);
                break;
            }
        }
    }

    public void comprarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.comprar();
                break;
            }
        }
    }
}