public class Node<T extends Comparable <T>> {
	private T dato;
	private Node<T> nextNode;

	public Node(T dato, Node<T> nextNode){
		this.dato = dato;
		this.nextNode = nextNode;
	}
	public Node(T dato){
		this.dato = dato;
		this.nextNode = null;
	}
	public T getDato(){
		return this.dato;
	}
	public void setDato(T dato){
		this.dato = dato;
	}
	public Node<T> getNext(){
		return this.nextNode;
	}
	public void setNext(Node<T> nextNode){
		this.nextNode = nextNode;
	}
	public String toString() {
		return this.dato.toString();
	}
	public int compareTo(T x) {
		return this.dato.compareTo(x);
	}
	
}