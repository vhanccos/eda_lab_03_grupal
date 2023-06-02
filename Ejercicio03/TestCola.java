public class TestCola {
    public static void main(String[] args) {
        Cola<Integer> cola = new Cola<>();

        System.out.println("Esta vacio? " + cola.vacia());

        cola.añadirCola(50);
        cola.añadirCola(70);
        cola.añadirCola(10);
        cola.añadirCola(40);
        cola.añadirCola(90);
        System.out.println("Tamaño de la cola: " + cola.tamaño());
        System.out.println("El primer nodo es : " + cola.obtenerCabeza());
        System.out.println("El ultimo nodo es : " + cola.obtenerUltimo());
        System.out.println(cola);

        System.out.println("Elemento desencolado: " + cola.eliminarCola());
        System.out.println(cola);
        System.out.println("El primer nodo es : " + cola.obtenerCabeza());
        
        System.out.println("\nSe añadio un nodo 15");
        
        cola.añadirCola(15);
        System.out.println(cola);
        System.out.println("El ultimo nodo es : " + cola.obtenerUltimo());
        
        System.out.println("Se elimina toda la cola");

        while (!cola.vacia()) {
            System.out.println("Elemento desencolado: " + cola.eliminarCola());
        }
        try {
            cola.eliminarCola();
        } catch (Exception e) {
            System.out.println("Excepción al desencolar: " + e.getMessage());
        }
    }
}
