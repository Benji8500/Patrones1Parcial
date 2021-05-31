package pregunta2;

public class Camara {
	private String foco;
	private String lente;
	
	public Camara(String f, String l){
		this.foco =f;
		this.lente=l;
	}
	public String getFoco() {
		return foco;
	}
	public void setFoco(String foco) {
		this.foco = foco;
	}
	public String getLente() {
		return lente;
	}
	public void setLente(String lente) {
		this.lente = lente;
	}
	

}
