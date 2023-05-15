
package com.mycompany.examen.Vista;

import com.mycompany.examen.Modelo.Libro;
import java.util.List;

public class BibliotecaView {
    public void mostrarLibrosEncontrados(List<Libro> librosEncontrados, String tituloBusqueda) {
        System.out.println("Resultados de la búsqueda:");
        if (librosEncontrados.isEmpty()) {
            System.out.println("No se encontraron libros con el título: " + tituloBusqueda);
        } else {
            for (Libro libro : librosEncontrados) {
                System.out.println(libro);
            }
        }
    }

    public void mostrarMensajeCompraExitosa(String titulo) {
        System.out.println("¡Has comprado el libro: " + titulo + "!");
    }

public void mostrarMensajeCompraFallida(String titulo) {
    System.out.println("El libro: " + titulo + " no está disponible para comprar.");
}

}