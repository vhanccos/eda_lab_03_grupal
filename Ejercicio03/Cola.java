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
           nodoul.setProximo(nodNuevo);
           nodoul = nodNuevo;
        }

    }
    public T eliminarCola(){

        if(vacia()){

            throw new NoSuchElementException("No se puede eliminar esta vacia");

        }
        T elemento = nodopr.getValor();
        nodopr=nodopr.getProximo();

        if(nodopr == null){
           nodoul=null;
        }
        return elemento;
    }
    public T obtenerCabeza(){

        if(vacia()){
           throw new NoSuchElementException("Cola vacia");
        }
        return nodopr.getValor();
    }
    public T obtenerUltimo(){

        if(vacia()){
           throw new NoSuchElementException("Cola vacia");
        }
        return nodoul.getValor();
    }
    public int tamaño(){
        int tamano=0;
    Node<T> nodo = nodopr;
    while(nodo != null){

        tamano++;
        nodo = nodo.getProximo();
    }
    return tamano;
    }
    public String toString(){
         String str = "";
         Node<T> aux = nodopr;  
        for(int i=0;i<tamaño();i++){        
        
         str += aux.getValor()+"\n";
         aux=aux.getProximo();

        }
     return str;
    }
}
