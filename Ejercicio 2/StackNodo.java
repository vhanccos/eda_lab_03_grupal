public class StackNodo<T> {
	
	private Node<T> root;
	
	public StackNodo() {
		this.root = null;
	}
	
	public void push(T x) { // colocamos un nuevo elemento a la cima
		this.root = new Node<T>(x,this.root);
	}
	public T pop() {
	}
	public T peek() { // top
	}
	public int search(T o) {
		
	}
	public boolean isEmpty() { // empty
		
	}
	public String toString() {
		String str = "";
		for (Node<T> i = this.root; i != null; i = i.getNext()) // recorre todos los nodos siempre y cuando contengan un elemento
			str += i.toString() + ", ";
		return str;
	}
}
