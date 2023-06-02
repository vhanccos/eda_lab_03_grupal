public class TestCola {
    public static void main(String[] args) {
        Cola<Integer> cola = new Cola<>();

        System.out.println("Esta vacio? " + cola.vacia());

        cola.añadirCola(50);
        cola.añadirCola(70);
        cola.añadirCola(10);
        cola.añadirCola(40);
        cola.añadirCola(90);
        System.out.println("El primer nodo es : " + cola.obtenerCabeza());
    }
}
