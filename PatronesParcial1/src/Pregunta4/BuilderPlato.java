package Pregunta4;

public abstract class BuilderPlato {
    protected Plato plato;

    public Plato getPlato() {
        return plato;
    }

    public void createPlato(){
        plato= new Plato();
    }

    public abstract void buildTipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();
   

}
