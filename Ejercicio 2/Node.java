public class Node<T> {
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
}