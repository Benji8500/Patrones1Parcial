package pregunta3;

public class CreatorPelota extends Creator {

	@Override
	public PelotaFutbol factoryMethod() {
		PelotaFutbol pelota = new PelotaFutbol();
		pelota.setTamano("10");
		pelota.setColor("blanco");
		pelota.setGarantia("1 a;o");
		pelota.setPrecio("");
		return pelota;
	}

}
