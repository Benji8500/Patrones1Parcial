package Pregunta4;

public class Client {
	public static void main(String[] args) {
		Director dir = new Director();
		Bife bife = new Bife();
		Lomito lomito = new Lomito();
		Tira tira = new Tira();
		dir.setBuilderPlato(bife);
		dir.prepararPlato();
		
		Plato platobife = dir.getPlato();
		platobife.showData();
		
		
		dir.setBuilderPlato(lomito);
		dir.prepararPlato();
		
		Plato platolomito = dir.getPlato();
		platolomito.showData();
		
		dir.setBuilderPlato(tira);
		dir.prepararPlato();
		
		Plato platotira = dir.getPlato();
		platotira.showData();
	}

}
