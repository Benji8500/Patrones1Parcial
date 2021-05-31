package pregunta3;

public class PelotaFutbol implements IElemento{
	
	private String tamano;
	private String color;
	private String garantia;
	private String precio;



	

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Instancia Pelota Futbol");
		
	}





	public String getTamano() {
		return tamano;
	}





	public void setTamano(String tamano) {
		this.tamano = tamano;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public String getGarantia() {
		return garantia;
	}





	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}





	public String getPrecio() {
		return precio;
	}





	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	

}
