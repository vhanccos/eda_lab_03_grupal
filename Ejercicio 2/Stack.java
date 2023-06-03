public class Stack<T> {
	
	private Node<T> root;
	
	public Stack() {
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
}
