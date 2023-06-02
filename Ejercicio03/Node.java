public class Node<T>{
    private T valor;
    private Node<T> proximo;

    public Node(T valor){
      this.valor = valor;
      this.proximo = null;

    }
    public T getValor(){
     return valor;
    
    }
    public Node<T> getProximo(){
     return proximo;
    
    }



}
