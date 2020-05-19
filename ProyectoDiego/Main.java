import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Date fecha = new Date();
        MiembroEquipo miembro;
        Herramienta herramienta;

        ArrayList <MiembroEquipo> miembros = new ArrayList();
        ArrayList <Herramienta> herramientas = new ArrayList();

        int indiceHerramienta = 0;
        int indiceMiembro = 0;
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
                    System.out.print("Ingresa el tiempo en el equipo de "+ nombre + ": ");
                    double tiempoEnEquipo = sc.nextDouble();
                    System.out.print("Ingresa el semestre de " + nombre + ": ");
                    int semestre = sc.nextInt();
                    System.out.print("Ingresa el plan de estudios de " + nombre + ": ");
                    String planDeEstudios = sc.next();
                    System.out.print("Ingresa el día de cumpleaños de " + nombre + ": ");
                    int diaDeCumple = sc.nextInt();
                    fecha.setDate(diaDeCumple);
                    System.out.print("Ingresa el mes de cumpleaños de " + nombre + ": ");
                    int mesDeCumple = sc.nextInt();
                    fecha.setMonth(mesDeCumple);

                    miembro = new MiembroEquipo(nombre, tiempoEnEquipo, semestre, planDeEstudios, fecha);
                    miembros.add(miembro);
                    break;
                case 2:
                    System.out.println("Ingresa el nombre de la herramienta: ");
                    String nombreDeHerramienta = sc.next();
                    System.out.println("Ingresa la cantidad de "+ nombreDeHerramienta + "s: ");
                    int cantidad = sc.nextInt();

                    herramienta = new Herramienta(nombreDeHerramienta, cantidad);
                    herramientas.add(herramienta);
                    break;
                case 3:
                    Herramienta herramientaPrestar;
                    System.out.println("¿Qué herramienta quieres pedir?, tenemos todas estas: ");
                    for(Herramienta h:herramientas){
                        System.out.println(h.nombreDeHerramienta);
                        System.out.println("Hay " + h.cantidad + " " + h.nombreDeHerramienta);
                    }
                    System.out.println("Ingresa que herramienta quieres: ");
                    String herramientaPrestada = sc.next();
                    for (Herramienta herr:herramientas){
                        if (herramientaPrestada.equals(herr.nombreDeHerramienta)){
                            break;
                        }
                        indiceHerramienta++;
                    }
                    System.out.print("Ingresa la cantidad que solicitas de " + herramientaPrestada + "s: ");
                    int cantidadAPrestar = sc.nextInt();
                    herramientaPrestar = herramientas.get(indiceHerramienta);
                    herramientaPrestar.prestarHerramienta(cantidadAPrestar);

                    herramientas.set(indiceHerramienta, herramientaPrestar);
                    break;
                case 4:
                    Herramienta herramientaDevolver;
                    indiceHerramienta = 0;
                    System.out.println("¿Qué herramienta vas a devolver?");
                    String devolver = sc.next();
                    for(Herramienta h:herramientas){
                        if (h.nombreDeHerramienta.equals(devolver)){
                            break;
                        }
                        indiceHerramienta++;
                    }

                    System.out.println("¿Cuántas vas a devolver?");
                    int cantidadADevolver = sc.nextInt();
                    herramientaDevolver = herramientas.get(indiceHerramienta);
                    herramientaDevolver.devolverHerramienta(cantidadADevolver);
                    herramientas.set(indiceHerramienta,herramientaDevolver);
                    break;
                case 5:
                    return;
            }
        }
    }
}
