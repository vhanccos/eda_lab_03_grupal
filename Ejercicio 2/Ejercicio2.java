import java.util.*;

public class Ejercicio2 {
	public static void main(String [] args) {
		StackNodo<Persona> gente = new StackNodo<Persona>();
		
		gente.push(new Persona());
		gente.push(new Persona(10,"Camilo"));
		System.out.println(gente);
	}
}