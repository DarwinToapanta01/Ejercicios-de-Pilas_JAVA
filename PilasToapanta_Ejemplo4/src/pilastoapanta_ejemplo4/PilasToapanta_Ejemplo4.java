package pilastoapanta_ejemplo4;

import java.util.Stack;
import pilastoapanta_ejemplo4.Pila.Tarea;
import static pilastoapanta_ejemplo4.Pila.agregarTarea;
import static pilastoapanta_ejemplo4.Pila.completarTarea;
import static pilastoapanta_ejemplo4.Pila.mostrarTareasPendientes;

public class PilasToapanta_Ejemplo4 {

    public static void main(String[] args) {
        // Crear una pila para almacenar tareas pendientes
        Stack<Tarea> Pila = new Stack<>();

        // Agregar algunas tareas
        agregarTarea(Pila, "Hacer la compra", 2);
        agregarTarea(Pila, "Preparar informe", 1);
        agregarTarea(Pila, "Enviar correo electronico", 3);

        // Mostrar las tareas pendientes antes de completarlas y el ordenamiento
        System.out.println("-----------------------------------------");
        System.out.println("Tareas pendientes antes del ordenamiento:");
        mostrarTareasPendientes(Pila);

        // Ordenar las tareas pendientes por prioridad
        Pila = ordenarTareasPorPrioridad(Pila);
        
        System.out.println("-----------------------------------------");
        // Mostrar las tareas pendientes después del ordenamiento
        System.out.println("\nTareas pendientes despues del ordenamiento:");
        mostrarTareasPendientes(Pila);

        // Realizar una búsqueda en la pila por nombre de tarea
        String nombreTareaABuscar = "Enviar correo electronico";
        Tarea tareaEncontrada = buscarTareaPorNombre(Pila, nombreTareaABuscar);
        System.out.println("-----------------------------------------");
        if (tareaEncontrada != null) {
            System.out.println("\nLa tarea '" + nombreTareaABuscar + "' fue encontrada.");
            System.out.println("Prioridad de la tarea: " + tareaEncontrada.getPrioridad());
        } else {
            System.out.println("\nLa tarea '" + nombreTareaABuscar + "' no fue encontrada.");
        }

        // Marcar una tarea como completada
        completarTarea(Pila, "Preparar informe");

        // Mostrar las tareas pendientes después de completar una tarea
        System.out.println("-----------------------------------------");
        System.out.println("\nTareas pendientes despues de completar una tarea:");
        mostrarTareasPendientes(Pila);
        System.out.println("-----------------------------------------");
    }

    // Método para ordenar las tareas por prioridad
    public static Stack<Tarea> ordenarTareasPorPrioridad(Stack<Tarea> pilaTareas) {
        Stack<Tarea> pilaTemp = new Stack<>();

        while (!pilaTareas.isEmpty()) {
            Tarea min = pilaTareas.pop();

            while (!pilaTemp.isEmpty() && pilaTemp.peek().getPrioridad() < min.getPrioridad()) {
                pilaTareas.push(pilaTemp.pop());
            }

            pilaTemp.push(min);
        }

        // Copiar elementos ordenados de la pila temporal a la pila original
        while (!pilaTemp.isEmpty()) {
            pilaTareas.push(pilaTemp.pop());
        }

        return pilaTareas;
    }

    // Método para buscar una tarea por nombre en la pila
    public static Tarea buscarTareaPorNombre(Stack<Tarea> pilaTareas, String nombreTarea) {
        for (Tarea tarea : pilaTareas) {
            if (tarea.getNombre().equals(nombreTarea)) {
                return tarea;
            }
        }
        return null;
    }
}