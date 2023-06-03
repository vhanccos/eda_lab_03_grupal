public class Persona {
	
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
	public String toString() {
		return "[Nombre: "+nombre+", Edad: "+edad+"]";
	}

}