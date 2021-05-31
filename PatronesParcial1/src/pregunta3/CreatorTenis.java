package pregunta3;

public class CreatorTenis extends Creator {

	@Override
	public Tenis factoryMethod() {
		Tenis ten = new Tenis();
		ten.setPrecio("");
		return ten;
	}

}
