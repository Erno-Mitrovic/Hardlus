public class Integrante extends MiembroEquipo{
  public Integrantes(String nombre, double tiempoEnEquipo, int semestre, String planDeEstudios,
  String areaDelEquipo, String equipoFTC, Date cumpleanios){
    super(nombre,tiempoEnEquipo,semestre,planDeEstudios,areaDelEquipo,equipoFTC,cumpleanios);
    this.tarea = "No tengo tarea";
  }
}
