package pilastoapanta_ejemplo1;

import java.util.ArrayList;

public class Pila {

    private ArrayList<String> pila;

    public Pila() {
        pila = new ArrayList<>();
    }

    // Método para agregar un elemento a la pila
    public void push(String elemento) {
        pila.add(elemento);
        System.out.println("Agregado: " + elemento);
    }

    // Método para eliminar y obtener el elemento superior de la pila
    public String pop() {
        if (!isEmpty()) {
            String elemento = pila.remove(pila.size() - 1);
            System.out.println("Eliminado: " + elemento);
            return elemento;
        }
        throw new IllegalStateException("La pila está vacía");
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    // Método de ordenamiento de burbuja para ordenar la pila alfabéticamente
    public void bubbleSort() {
        int n = pila.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pila.get(j).compareTo(pila.get(j + 1)) > 0) {
                    // Swap pila[j] y pila[j+1]
                    String temp = pila.get(j);
                    pila.set(j, pila.get(j + 1));
                    pila.set(j + 1, temp);
                    System.out.println("Intercambiados: " + pila.get(j) + " y " + pila.get(j + 1));
                }
            }
        }
    }

    // Método de búsqueda lineal
    public boolean buscar(String elemento) {
        for (String e : pila) {
            if (e.equals(elemento)) {
                System.out.println("Elemento encontrado: " + elemento);
                return true;
            }
        }
        System.out.println("Elemento no encontrado: " + elemento);
        return false;
    }
}