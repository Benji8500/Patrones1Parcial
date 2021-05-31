package pregunta1;

public class Client {
	public static void main(String[] args) {
		Thread Estudiante1 = new Thread(new Runnable() {
            @Override
            public void run() {
               Ventanilla vent = Ventanilla.getInstance();
               Estudiante E1= new Estudiante("juan"," 11234");
               vent.matriculacion(E1);
            }
        });
		
		Thread Estudiante2 = new Thread(new Runnable() {
            @Override
            public void run() {
               Ventanilla vent = Ventanilla.getInstance();
               Estudiante E2= new Estudiante("Erick"," 88888");
               vent.matriculacion(E2);
            }
        });
		
		Thread Estudiante3 = new Thread(new Runnable() {
            @Override
            public void run() {
               Ventanilla vent = Ventanilla.getInstance();
               Estudiante E3= new Estudiante("Ana"," 999");
               vent.matriculacion(E3);
            }
        });
		
		Thread Estudiante4 = new Thread(new Runnable() {
            @Override
            public void run() {
               Ventanilla vent = Ventanilla.getInstance();
               Estudiante E4= new Estudiante("juan"," 11234");
               vent.matriculacion(E4);
            }
        });

        

        Estudiante1.start();
        Estudiante2.start();
        Estudiante3.start();
        Estudiante4.start();



       
    

	}
}
