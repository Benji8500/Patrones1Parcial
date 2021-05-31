package Pregunta4;

public class Lomito extends BuilderPlato{

	@Override
	public void buildTipoDeCarne() {
		plato.setTipoDeCarne("bife");
		
	}

	@Override
	public void buildSaborRefresco() {
		plato.setSaborRefresco("CocaCola");
		
	}

	@Override
	public void buildGuarniciones() {
		plato.setGuarniciones("papasFritas");		
	}

}
