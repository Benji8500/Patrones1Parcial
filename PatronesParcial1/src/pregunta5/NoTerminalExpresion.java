package pregunta5;

import java.util.ArrayList;
import java.util.List;

public class NoTerminalExpresion extends  AbstractExpresion {

    private List<AbstractExpresion> parseTree= new ArrayList<>();
    private Context context;

    public NoTerminalExpresion(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context= new Context(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                
                case "I":
                    parseTree.add(new TerminalExpresionI());
                    break;
                
            }

        }
    }


    public String interpretar(){
        for (AbstractExpresion terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}
