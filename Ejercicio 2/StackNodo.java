public class StackNodo<T extends Comparable <T>> {
	
	private Node<T> root; // tope o cima de la pila
	
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
	public int search(T x) {// recorre todos los nodos siempre que existan, se detiene cuando uno es igual y retorna 1, en todo caso retorna -1
		Node<T> aux = this.root;
		for(/* */ ; aux != null && !(aux.compareTo(x)==0) ;  aux = aux.getNext());
		if (aux != null) {
			return 1; // ha encontrado al elemento
		}
		else {
			return -1; // no lo encontro
		}
		
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
