import java.util.*;

public class Ejercicio2 {
	public static void main(String [] args) {
		StackNodo<Persona> gente = new StackNodo<Persona>();
		
		//gente.peek(); -> suelta el error no hay espacio en la pila
		gente.push(new Persona());
		gente.push(new Persona(10,"Camilo"));
		System.out.println(gente);
		System.out.println(gente.peek());
	}
}