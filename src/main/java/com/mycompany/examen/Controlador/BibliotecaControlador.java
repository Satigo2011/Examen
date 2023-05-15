
package com.mycompany.examen.Controlador;



import com.mycompany.examen.Modelo.Libro;
import com.mycompany.examen.Vista.BibliotecaView;
import java.util.List;
public class BibliotecaControlador {
        public BibliotecaControlador(Biblioteca biblioteca, BibliotecaView bibliotecaView) {
        this.biblioteca = biblioteca;
        this.bibliotecaView = bibliotecaView;
    }

    public void agregarLibro(String titulo, String autor) {
        biblioteca.agregarLibro(titulo, autor);
    }

    public void buscarLibrosPorTitulo(String titulo) {
        List<Libro> librosEncontrados = biblioteca.buscarLibrosPorTitulo(titulo);
        bibliotecaView.mostrarResultadosBusqueda(librosEncontrados, titulo);
    }

    public void actualizarDisponibilidad(String titulo, boolean disponible) {
        biblioteca.actualizarDisponibilidad(titulo, disponible);
    }

    public void comprarLibro(String titulo) {
        boolean compraExitosa = biblioteca.comprarLibro(titulo);
        if (compraExitosa) {
            bibliotecaView.mostrarMensajeCompraExitosa(titulo);
        } else {
            bibliotecaView.mostrarMensajeCompraFallida(titulo);
        }
    }

    // Otros métodos y lógica relacionada con la interacción entre la vista y el modelo
}

