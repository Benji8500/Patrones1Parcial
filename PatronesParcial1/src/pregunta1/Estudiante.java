package pregunta1;

public class Estudiante {
	String nombre;
	String ci;
	
	public Estudiante (String s, String c) {
		this.nombre=s;
		this.ci=c;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	
	
}
