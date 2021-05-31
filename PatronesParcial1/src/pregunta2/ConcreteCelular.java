package pregunta2;

public class ConcreteCelular implements iCelular {
	private String modelo;
	private String tamano;
	private String peso;
	private Camara camara;
	private String imei;
	private String pais;





	public ConcreteCelular() {
		
	}
	
	@Override public Object clone() {
		ConcreteCelular objClone = new ConcreteCelular();
		objClone.setModelo(this.modelo);
		objClone.setTamano(this.tamano);
		objClone.setPeso(this.peso);
		objClone.setCamara(this.camara);
		objClone.setImei(this.imei);
		objClone.setModelo(this.pais);



		
		return objClone;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	

}
