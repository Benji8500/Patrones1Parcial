package pregunta3;

public class Client {
	public static void main(String[] args) {
		PelotaFutbol pelota = new CreatorPelota().factoryMethod();
		pelota.setPrecio("300bs");
		pelota.create();
		
		Camiseta camiseta = new CreatorCamiseta().factoryMethod();
		camiseta.setPrecio("150bs");
		camiseta.create();
		
		Tenis tenis = new CreatorTenis().factoryMethod();
		tenis.setPrecio("600bs");
		tenis.create();
		
		Shorts shorts = new CreatorShorts().factoryMethod();
		shorts.setPrecio("150bs");
		shorts.create();
		
		Medias medias = new CreatorMedias().factoryMethod();
		medias.setPrecio("50bs");
		medias.create();
	}

}
