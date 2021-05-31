package Pregunta4;

public class Director {
	private BuilderPlato builderPlato;
	public void setBuilderPlato(BuilderPlato builderPlato) {
		this.builderPlato=builderPlato;
	}
	public Plato getPlato() {
		return builderPlato.getPlato();
	}
	public void prepararPlato() {
		this.builderPlato.createPlato();
		this.builderPlato.buildTipoDeCarne();
		this.builderPlato.buildSaborRefresco();
		this.builderPlato.buildGuarniciones();
	}

}
