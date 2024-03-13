package pilastoapanta_ejemplo1;

public class PilasToapanta_Ejemplo1 {

    public static void main(String[] args) {
        Pila pila = new Pila();

        // Agregar nombres a la pila
        System.out.println("------------------------------------");
        System.out.println("AGREGANDO ELEMENTOS A LA PILA");
        pila.push("Carlos");
        pila.push("Karen");
        pila.push("Juan");
        pila.push("Maria");
        pila.push("Pedro");
        System.out.println("------------------------------------");

        // Ordenar la pila alfabéticamente utilizando Bubble Sort
        System.out.println("ORDENANDO LOS NOMBRES");
        pila.bubbleSort();
       System.out.println("------------------------------------");

        // Realizar una búsqueda en la pila
        System.out.println("BUSQUEDA DE UN NOMBRE");
        String nombreABuscar = "Maria";
        pila.buscar(nombreABuscar);
        System.out.println("------------------------------------");
    }
}