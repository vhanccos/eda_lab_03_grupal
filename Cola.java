public class Cola {

    class Nodo {
        int info;
        Nodo sig;
    }

    private Nodo raiz, fondo;

    Cola() {
        raiz = null;
        fondo = null;
    }

    boolean vacia() {
        if (raiz == null)
            return true;
        else
            return false;
    }

    void insertar(int info) {
        // insertar cola
    }

    int extraer() {
        // extraer cola
        return 0;
    }

    public void imprimir() {
        Nodo reco = raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco != null) {
            // mostrar elemento
        }
    }

    public static void main(String[] ar) {
        Cola cola1 = new Cola();
        // cola1.insertar(5);
        // cola1.insertar(10);
        // cola1.insertar(50);
    }
}