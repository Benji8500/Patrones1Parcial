package pregunta3;

public class CreatorCamiseta extends Creator {

	@Override
	public Camiseta factoryMethod() {
		Camiseta cam = new Camiseta();
		cam.setPrecio("");
		return cam;
	}

}
