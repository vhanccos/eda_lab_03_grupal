public class Persona implements Comparable<Persona>{
	
	private int edad;
	private String nombre;
	
	public Persona() {
		this.edad=0;
		this.nombre = "Desconocido";
	}
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	public void setNombre(String nombre) {
		this.nombre =  nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public int compareTo(Persona x) {
		if (this.nombre.equals(x.getNombre()) && (this.edad == x.getEdad())) {
			return 0;// es igual
		}
		return -1;// no es igual
	}
	public String toString() {
		return nombre+", "+"Edad: "+edad;
	}

}