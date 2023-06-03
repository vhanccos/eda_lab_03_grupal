import java.util.*;

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
	}
}