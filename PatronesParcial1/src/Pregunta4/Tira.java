package Pregunta4;

public class Tira extends BuilderPlato{

	@Override
	public void buildTipoDeCarne() {
		plato.setTipoDeCarne("tira de carne");
		
	}

	@Override
	public void buildSaborRefresco() {
		plato.setSaborRefresco("CocaCola");
		
	}

	@Override
	public void buildGuarniciones() {
		plato.setGuarniciones("fideo");		
	}

}
