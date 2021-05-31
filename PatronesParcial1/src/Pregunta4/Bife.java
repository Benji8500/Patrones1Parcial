package Pregunta4;

public class Bife extends BuilderPlato{

	@Override
	public void buildTipoDeCarne() {
		plato.setTipoDeCarne("lomo");
		
	}

	@Override
	public void buildSaborRefresco() {
		plato.setSaborRefresco("pepsi");
		
	}

	@Override
	public void buildGuarniciones() {
		plato.setGuarniciones("arroz");		
	}

}
