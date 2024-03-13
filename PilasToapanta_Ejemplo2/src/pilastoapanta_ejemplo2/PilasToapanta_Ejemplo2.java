package pilastoapanta_ejemplo2;

public class PilasToapanta_Ejemplo2 {

    public static void main(String[] args) {

        // Crear una nueva pila de libros
        System.out.println("Creando pila de libros...");
        Pila pilaLibros = new Pila();

        // Agregar libros a la pila
        System.out.println("Agregando libros a la pila...");
        pilaLibros.push(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 1967));
        pilaLibros.push(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));
        pilaLibros.push(new Libro("1984", "George Orwell", 1949));
        pilaLibros.push(new Libro("El principito", "Antoine de Saint-Exupery", 1943));
        pilaLibros.push(new Libro("El amor en los tiempos del colera", "Gabriel Garcia Marquez", 1985));

        // Ordenar la pila de libros por año de publicación utilizando Selection Sort
        System.out.println("Ordenando la pila de libros por fecha de publicacion...");
        pilaLibros.selectionSort();

        // Imprimir la pila de libros ordenada
        pilaLibros.imprimirPila();

        // Realizar una búsqueda en la pila por título
        System.out.println("Realizando busqueda en la pila por titulo...");
        String tituloABuscar = "1984";
        Libro libroEncontrado = pilaLibros.buscar(tituloABuscar);
        if (libroEncontrado != null) {
            System.out.println("El libro '" + tituloABuscar + "' fue encontrado.");
            System.out.println("Autor: " + libroEncontrado.autor);
            System.out.println("Fecha de publicacion: " + libroEncontrado.anioPublicacion);
        } else {
            System.out.println("El libro '" + tituloABuscar + "' no fue encontrado.");
        }
    }
}