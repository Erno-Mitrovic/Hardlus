import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Date fecha = new Date();
        Integrante integrante;
        Herramienta herramienta;
        Mentor mentor;

        ArrayList <Integrante> integrantes = new ArrayList();
        ArrayList <Herramienta> herramientas = new ArrayList();
        ArrayList <Mentor> mentores = new ArrayList();

        //Los índices son por si acaso
        int indiceHerramienta = 0;
        int indiceMiembro = 0;
        int indiceMentor = 0;
        while(true){

            //Imprimir opciones del menu
            System.out.println("1. Agregar miembro del equipo.");
            System.out.println("2. Agregar mentor.");
            System.out.println("3. Agregar herramienta.");
            System.out.println("4. Prestar herramienta.");
            System.out.println("5. Devolver herramienta.");
            System.out.println("6. Exit\n");
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
                    System.out.println("Ingresa el area en el equipo de " + nombre + ": ");
                    String areaDelEquipo = sc.next();
                    System.out.println("Ingresa el equipo FTC de "+ nombre + ": ");
                    String equipoFTC = sc.next();
                    System.out.print("Ingresa el día de cumpleaños de " + nombre + ": ");
                    int diaDeCumple = sc.nextInt();
                    fecha.setDate(diaDeCumple);
                    System.out.print("Ingresa el mes de cumpleaños de " + nombre + ": ");
                    int mesDeCumple = sc.nextInt();
                    fecha.setMonth(mesDeCumple);

                    integrante = new Integrante(nombre, tiempoEnEquipo, semestre, planDeEstudios, areaDelEquipo,
                    equipoFTC, fecha);
                    integrantes.add(integrante);
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del mentor: ");
                    String nombreDeMentor = sc.next();
                    System.out.print("Ingresa el tiempo en el equipo de "+ nombreDeMentor + ": ");
                    double tiempoEnElEquipo = sc.nextDouble();
                    System.out.print("Ingresa el semestre de " + nombreDeMentor + ": ");
                    int semestreProfesional = sc.nextInt();
                    System.out.print("Ingresa el plan de estudios de " + nombreDeMentor + ": ");
                    String planDeCarrera = sc.next();
                    System.out.println("Ingresa el area en el equipo de " + nombreDeMentor + ": ");
                    String areaEnEquipo = sc.next();
                    System.out.println("Ingresa el equipo FTC de "+ nombreDeMentor + ": ");
                    String equipoMentor = sc.next();
                    System.out.print("Ingresa el día de cumpleaños de " + nombreDeMentor + ": ");
                    int diaCumple = sc.nextInt();
                    fecha.setDate(diaCumple);
                    System.out.print("Ingresa el mes de cumpleaños de " + nombreDeMentor + ": ");
                    int mesCumple = sc.nextInt();
                    fecha.setMonth(mesCumple);

                    mentor = new Mentor(nombreDeMentor, tiempoEnElEquipo, semestreProfesional,
                    planDeCarrera, areaEnEquipo, equipoMentor, fecha);
                    mentores.add(mentor);

                    System.out.println("¿" + nombreDeMentor + " quiere asignar una tarea? (Si/No)");
                    String ans = sc.next();
                    if (ans.equals("Si")){
                      System.out.println("Los integrantes registrados son: ");
                      for (int i = 0;i < integrantes.size() ; i++) {
                        integrante = integrantes.get(i);
                        int pos = i++;
                        System.out.println(pos + ". " + integrante.nombre);
                      }
                      System.out.println("¿A qué miembro del equipo le va a asignar una tarea? (Ingresa el número)");
                      int index = sc.nextInt() - 1;
                      integrante = integrantes.get(index);
                      System.out.println("¿Qué tarea va a tener "+ integrante.nombre + "?");
                      String tarea = sc.next();
                      mentor.asignarTarea(integrante, tarea);
                    }
                    else break;
                case 3:
                    System.out.println("Ingresa el nombre de la herramienta: ");
                    String nombreDeHerramienta = sc.next();
                    System.out.println("Ingresa la cantidad de "+ nombreDeHerramienta + "s: ");
                    int cantidad = sc.nextInt();

                    herramienta = new Herramienta(nombreDeHerramienta, cantidad);
                    herramientas.add(herramienta);
                    break;
                case 4:
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
                case 5:
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
                case 6:
                    return;
            }
        }
    }
}
