package pilastoapanta_ejemplo4;

import java.util.Stack;

public class Pila {
    // Clase para representar una tarea con nombre y prioridad
    static class Tarea {
        private String nombre;
        private int prioridad;

        public Tarea(String nombre, int prioridad) {
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

    // Método para agregar una tarea a la pila de tareas pendientes
    public static void agregarTarea(Stack<Tarea> pilaTareas, String nombreTarea, int prioridad) {
        Tarea tarea = new Tarea(nombreTarea, prioridad);
        pilaTareas.push(tarea);
    }

    // Método para marcar una tarea como completada
    public static void completarTarea(Stack<Tarea> pilaTareas, String nombreTarea) {
        Stack<Tarea> pilaTemp = new Stack<>();

        while (!pilaTareas.isEmpty()) {
            Tarea tarea = pilaTareas.pop();
            if (!tarea.getNombre().equals(nombreTarea)) {
                pilaTemp.push(tarea);
            }
        }

        // Restaurar las tareas no completadas en la pila original
        while (!pilaTemp.isEmpty()) {
            pilaTareas.push(pilaTemp.pop());
        }
    }

    // Método para mostrar las tareas pendientes ordenadas por prioridad
    public static void mostrarTareasPendientes(Stack<Tarea> pilaTareas) {
        for (Tarea tarea : pilaTareas) {
            System.out.println("Nombre: " + tarea.getNombre() + ", Prioridad: " + tarea.getPrioridad());
        }
    }
}