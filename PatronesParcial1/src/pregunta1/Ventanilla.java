package pregunta1;

import java.util.Date;

public class Ventanilla {
	//attributo del mismo tipo
    public static Ventanilla instance = null;
    
    private int monto=0;
    //constructor privado
    private Ventanilla(){
        System.out.println("INFO> creando Singleton");
    }

    private synchronized static void makeInstace(){
        if (instance == null)
            instance= new Ventanilla();
     }


    // metodo publico que retorne la instance
    public static Ventanilla getInstance(){
         if (instance == null)
             makeInstace();
         return  instance;
    }

    public void print(){
        System.out.println("Usando el singleton");
    }
    
    public synchronized void matriculacion(Estudiante es) {
    	monto+=50;
    	System.out.println("HORA DE MATRICULA: "+ new Date().getTime()+ " MATRICULA: ESTUDIANTE: "+ es.getNombre() + es.getCi() + " MONTO ACTUAL: "+ monto);
    }



}
