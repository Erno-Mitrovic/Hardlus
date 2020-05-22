import java.util.Date;
public class Mentor extends MiembroEquipo{
  Date date = new Date();
  public Mentor(String nombre, double tiempoEnEquipo, int semestre, String planDeEstudios,
  String areaDelEquipo, String equipoFTC, Date cumpleanios){
    super(nombre,tiempoEnEquipo,semestre,planDeEstudios,areaDelEquipo,equipoFTC,cumpleanios);
    this.tarea = "Asignar tareas y revisar procesos";
  }
  public void asignarTarea(Integrante miembro,String tarea){
    miembro.tarea = tarea;
    System.out.println(this.nombre + " le asignó la tarea a " + miembro.nombre + ".");
  }
}
