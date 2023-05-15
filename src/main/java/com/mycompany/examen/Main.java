package com.mycompany.examen;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Agregar algunos libros a la biblioteca
        biblioteca.agregarLibro("Harry Potter", "J.K. Rowling");
        biblioteca.agregarLibro("El Señor de los Anillos", "J.R.R. Tolkien");
        biblioteca.agregarLibro("Cien años de soledad", "Gabriel García Márquez");
        biblioteca.agregarLibro("1984", "George Orwell");
        biblioteca.agregarLibro("Don Quijote de la Mancha", "Miguel de Cervantes");


        // Actualizar disponibilidad de un libro
        String titulo = "Harry Potter";
        boolean disponible = false;
        biblioteca.actualizarDisponibilidad(titulo, disponible);

        // Buscar libros por título
        String tituloBusqueda = "Harry Potter";
        List<Libro> librosEncontrados = biblioteca.buscarLibrosPorTitulo(tituloBusqueda);

        System.out.println(obtenerResultadoBusqueda(librosEncontrados, tituloBusqueda));

        // Comprar un libro
        String tituloCompra = "Harry Potter";
        biblioteca.comprarLibro(tituloCompra);
    }

    private static String obtenerResultadoBusqueda(List<Libro> librosEncontrados, String tituloBusqueda) {
        StringBuilder sb = new StringBuilder();
        sb.append("Resultados de la búsqueda:\n");

        if (librosEncontrados.isEmpty()) {
            sb.append("No se encontraron libros con el título: ").append(tituloBusqueda);
        } else {
            for (Libro libro : librosEncontrados) {
                sb.append(libro.toString()).append("\n");
            }
        }

        return sb.toString();
    }
}