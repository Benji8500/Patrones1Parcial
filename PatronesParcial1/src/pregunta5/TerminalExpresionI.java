package pregunta5;

public class TerminalExpresionI extends AbstractExpresion{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("I")){
            // la interpretacion de la letra/simbolo y lo agregamos al output
            context.output= context.output+"1";
            // el borrado de la letra/simbolo ya interpretado en el input
            context.input=context.input.substring(1);
        }
    }
}
