package Pregunta4;

public class Plato {
	private String tipoDeCarne;
	private String SaborRefresco;
	private String Guarniciones;
	
	public Plato () {
		
	}

	public String getTipoDeCarne() {
		return tipoDeCarne;
	}

	public void setTipoDeCarne(String tipoDeCarne) {
		this.tipoDeCarne = tipoDeCarne;
	}

	public String getSaborRefresco() {
		return SaborRefresco;
	}

	public void setSaborRefresco(String saborRefresco) {
		SaborRefresco = saborRefresco;
	}

	public String getGuarniciones() {
		return Guarniciones;
	}

	public void setGuarniciones(String guarniciones) {
		Guarniciones = guarniciones;
	}
	
	public void showData(){
	       System.out.println("tipoDeCarne :"+tipoDeCarne);
	       System.out.println("SaborRefresco :"+SaborRefresco);
	       System.out.println("Guarniciones :"+Guarniciones);


	    }
	
	

}
