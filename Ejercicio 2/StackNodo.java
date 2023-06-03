public class StackNodo<T> {
	
	private Node<T> root;
	
	public StackNodo() {
		this.root = null;
	}
	
	public void push(T x) { // colocamos un nuevo elemento a la cima
		this.root = new Node<T>(x,this.root);
	}
	public T pop() {
		if (isEmpty()) {
			throw new NoSuchElementException("¡No hay elementos en la pila!"); 
		}
		else {// "desconectamos" a nuestro tope/cima y devolvemos el valor de esta
			T datoAux = this.root.getDato();
			this.root = this.root.getNext();
			return datoAux;	
		}
	}
	public T peek() { // top , devuelve el valor en la cima (NO lo borra)
		if (isEmpty()) {
			throw new NoSuchElementException("¡No hay elementos en la pila!"); 
		}
		else {
			return this.root.getDato();
		}
	}
	public int search(T o) {
		
	}
	public boolean isEmpty() { // empty
		return this.root == null;
	}
	public String toString() {
		String str = "[";
		for (Node<T> i = this.root; i != null; i = i.getNext()) { // recorre todos los nodos siempre y cuando contengan un elemento
			str += i.toString() + "],[";
		}
		return str;
	}
}
