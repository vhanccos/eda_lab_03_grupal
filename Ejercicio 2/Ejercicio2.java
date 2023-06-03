
public class Ejercicio2 {
	public static void main(String [] args) {
		StackNodo<Persona> gente = new StackNodo<Persona>();
		
		//gente.peek(); -> suelta el error no hay espacio en la pila
		gente.push(new Persona());
		gente.push(new Persona(10,"Camilo"));
		gente.push(new Persona(30,"Italo"));
		System.out.println("Datos: "+gente);
		System.out.println("Dato en la cima: "+gente.peek());
		System.out.println("Eliminamos a "+gente.pop());
		System.out.println("Datos: "+gente);
		System.out.println("Buscando a: Camila, con 10 años: "+gente.search(new Persona(10,"Camila")));
		System.out.println("Buscando a: Camilo, con 20 años: "+gente.search(new Persona(20,"Camilo")));
		System.out.println("Buscando a: Camilo, con 10 años: "+gente.search(new Persona(10,"Camilo"))+"\n");
		
		StackNodo<Integer> enteros = new StackNodo<Integer>();
		
		//gente.peek(); -> suelta el error no hay espacio en la pila
		enteros.push(3);
		enteros.push(6);
		enteros.push(11);
		enteros.push(1);

		System.out.println("Datos: "+enteros);
		System.out.println("Dato en la cima: "+enteros.peek());
		System.out.println("Eliminamos a "+enteros.pop());
		System.out.println("Datos: "+enteros);
		System.out.println("Buscando al numero 111:"+enteros.search(111));
		System.out.println("Buscando al numero 6:"+enteros.search(6)+"\n");
		
		StackNodo<String> Strings = new StackNodo<String>();
		
		//gente.peek(); -> suelta el error no hay espacio en la pila
		Strings.push("a");
		Strings.push("b");
		Strings.push("c");
		Strings.push("d");

		System.out.println("Datos: "+Strings);
		System.out.println("Dato en la cima: "+Strings.peek());
		System.out.println("Eliminamos a "+Strings.pop());
		System.out.println("Datos: "+Strings);
		System.out.println("Buscando a la letra d:"+Strings.search("d"));
		System.out.println("Buscando a la letra a:"+Strings.search("a")+"\n");
		
		
	}
}