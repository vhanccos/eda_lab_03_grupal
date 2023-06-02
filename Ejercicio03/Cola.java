import java.util.*;

public class Cola<T> {

    private Node<T> nodopr;
    private Node<T> nodoul;

    public Cola() {
        nodopr=null;
        nodoul=null;
    }
    
    public boolean vacia(){
        return nodopr == null;
    }

    public void añadirCola(T valor){

        Node<T> nodNuevo = new Node<>(valor);
        if(vacia()){

            nodopr=nodNuevo;
            nodoul = nodNuevo;

        }else{
           nodoul.setNextNode(nodNuevo);
           nodoul = nodNuevo;


        }

    }
}