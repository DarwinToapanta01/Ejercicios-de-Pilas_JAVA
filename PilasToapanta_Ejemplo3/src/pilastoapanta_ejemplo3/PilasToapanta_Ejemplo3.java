package pilastoapanta_ejemplo3;

import java.util.Stack;
import static pilastoapanta_ejemplo3.Pila.buscarDocumentoPorNombre;
import static pilastoapanta_ejemplo3.Pila.imprimirPila;
import static pilastoapanta_ejemplo3.Pila.ordenarDocumentosPorPrioridad;

public class PilasToapanta_Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una pila para almacenar documentos
        Stack<Documento> pilaDocumentos = new Stack<>();

        // Agregar documentos a la pila
        System.out.println("-----------------------------------------");
        pilaDocumentos.push(new Documento("Informe Mensual", 3));
        pilaDocumentos.push(new Documento("Contrato de Servicio", 1));
        pilaDocumentos.push(new Documento("Presupuesto Anual", 2));

        // Imprimir la pila antes del ordenamiento
        System.out.println("Documentos antes del ordenamiento:");
        imprimirPila(pilaDocumentos);
        System.out.println("-----------------------------------------");

        // Ordenar los documentos por prioridad utilizando el algoritmo de selección
        ordenarDocumentosPorPrioridad(pilaDocumentos);

        // Imprimir la pila después del ordenamiento
        System.out.println("\nDocumentos ordenados:");
        imprimirPila(pilaDocumentos);

        // Realizar una búsqueda en la pila por nombre del documento
        String nombreDocumentoABuscar = "Contrato de Servicio";
        Documento documentoEncontrado = buscarDocumentoPorNombre(pilaDocumentos, nombreDocumentoABuscar);
        System.out.println("-----------------------------------------");
        if (documentoEncontrado != null) {
            System.out.println("\nEl documento '" + nombreDocumentoABuscar + "' fue encontrado.");
            System.out.println("Prioridad del documento: " + documentoEncontrado.getPrioridad());
        } else {
            System.out.println("\nEl documento '" + nombreDocumentoABuscar + "' no fue encontrado.");
        }
        System.out.println("-----------------------------------------");
    }

}