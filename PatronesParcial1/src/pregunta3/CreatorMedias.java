package pregunta3;

public class CreatorMedias extends Creator {

	@Override
	public Medias factoryMethod() {
		Medias med = new Medias();
		med.setPrecio("");
		return med;
	}

}
