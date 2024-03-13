package pilastoapanta_ejemplo2;

import java.util.ArrayList;

class Libro {

    String titulo;
    String autor;
    int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
}

public class Pila {

    private ArrayList<Libro> pila;

    public Pila() {
        pila = new ArrayList<>();
    }

    // Método para agregar un libro a la pila
    public void push(Libro libro) {
        pila.add(libro);
    }

    // Método para eliminar y obtener el libro superior de la pila
    public Libro pop() {
        if (!isEmpty()) {
            return pila.remove(pila.size() - 1);
        }
        throw new IllegalStateException("La pila esta vacia");
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    // Método de ordenamiento por selección para ordenar la pila por año de publicación
    public void selectionSort() {
        int n = pila.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (pila.get(j).anioPublicacion < pila.get(minIdx).anioPublicacion) {
                    minIdx = j;
                }
            }
            Libro temp = pila.get(minIdx);
            pila.set(minIdx, pila.get(i));
            pila.set(i, temp);
        }
    }

    // Método de búsqueda lineal por título
    public Libro buscar(String titulo) {
        for (Libro libro : pila) {
            if (libro.titulo.equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // Método para imprimir la pila de libros
    public void imprimirPila() {
        System.out.println("Libros en la pila:");
        for (Libro libro : pila) {
            System.out.println("Titulo: " + libro.titulo);
            System.out.println("Autor: " + libro.autor);
            System.out.println("Fecha de publicacion: " + libro.anioPublicacion);
            System.out.println("------------------------");
        }
    }
}
