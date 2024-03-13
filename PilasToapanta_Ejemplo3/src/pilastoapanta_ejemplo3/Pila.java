package pilastoapanta_ejemplo3;

import java.util.Stack;

public class Pila {

    // Método de ordenamiento por selección para ordenar los documentos por prioridad
    public static void ordenarDocumentosPorPrioridad(Stack<Documento> pilaDocumentos) {
        Stack<Documento> pilaTemp = new Stack<>();

        while (!pilaDocumentos.isEmpty()) {
            Documento min = pilaDocumentos.pop();

            while (!pilaTemp.isEmpty() && pilaTemp.peek().getPrioridad() < min.getPrioridad()) {
                pilaDocumentos.push(pilaTemp.pop());
            }

            pilaTemp.push(min);
        }

        // Copiar elementos ordenados de la pila temporal a la pila original
        while (!pilaTemp.isEmpty()) {
            pilaDocumentos.push(pilaTemp.pop());
        }
    }

    // Método para buscar un documento por nombre en la pila
    public static Documento buscarDocumentoPorNombre(Stack<Documento> pilaDocumentos, String nombreDocumento) {
        for (Documento documento : pilaDocumentos) {
            if (documento.getNombre().equals(nombreDocumento)) {
                return documento;
            }
        }
        return null;
    }

    // Método para imprimir los documentos en la pila
    public static void imprimirPila(Stack<Documento> pilaDocumentos) {
        for (Documento documento : pilaDocumentos) {
            System.out.println("Nombre: " + documento.getNombre() + ", Prioridad: " + documento.getPrioridad());
        }
    }
}

// Clase para representar un documento con nombre y prioridad
class Documento {

    private String nombre;
    private int prioridad;

    public Documento(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
