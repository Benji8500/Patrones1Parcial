package pregunta3;

public class CreatorShorts extends Creator {

	@Override
	public Shorts factoryMethod() {
		Shorts sho = new Shorts();
		sho.setPrecio("");
		return sho;
	}

}
