import java.util.Date;

public class MiembroEquipo{
  public String nombre;
  public double tiempoEnEquipo;
  int semestre;
  String planDeEstudios;
  String areaDelEquipo;
  String equipoFTC;
  Date cumpleanios;
  String tarea;

  public MiembroEquipo(String nombre, double tiempoEnEquipo, int semestre, String planDeEstudios,
  String areaDelEquipo, String equipoFTC, Date cumpleanios){
    this.nombre = nombre;
    this.tiempoEnEquipo = tiempoEnEquipo;
    this.semestre = semestre;
    this.planDeEstudios = planDeEstudios;
    this.areaDelEquipo = areaDelEquipo;
    this.equipoFTC = equipoFTC;
    this.cumpleanios = cumpleanios;
  }
}
