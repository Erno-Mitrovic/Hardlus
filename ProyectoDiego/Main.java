import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Variables para guardar a mentores
        /*
        Mentor mentor;
        Mentor mentor1;
        Mentor mentor2;
        */

        //Variables para guardar herramientas
        /*
        Herramienta herramienta1;
        Herramienta herramienta2;
        Herramienta herramienta3;
        */
        Herramienta herramienta1 = new Herramienta();
        MiembroEquipo mentor = new MiembroEquipo("");
        while(true){

            //Imprimir opciones del menu
            System.out.println("1. Agregar miembro del equipo.");
            System.out.println("2. Agregar herramienta");
            System.out.println("3. Prestar herramienta");
            System.out.println("4. Devolver herramienta");
            System.out.println("5. Exit\n");
            System.out.print("Elige una opcion: ");

            //Leer input del usuario
            int input = sc.nextInt();
            switch(input){
                case 1:
                    System.out.print("Ingresa el nombre del miembro del equipo: ");
                    String nombre = sc.next();
                    mentor = new MiembroEquipo(nombre);
                    break;
                case 2:
                    //Llamar al constructor de herramienta
                    herramienta1.registrarHerramienta();
                    break;
                case 3:
                    System.out.print("Ingresa la cantidad que solicitas");
                    int cantidad = sc.nextInt();
                    herramienta1.prestarHerramienta(cantidad);
                    break;
                case 4: 
                    System.out.println("¿Cuántas vas a devolver?");
                    int cantidad = sc.nextInt();
                    herramienta1.devolverHerramienta(cantidad);
                    break;
                case 5: return;
            }
        }
    }
}
