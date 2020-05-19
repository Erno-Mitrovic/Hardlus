import java.util.Random;
import java.util.Scanner;

public class Herramienta{
  Random rand = new Random();
  Scanner scan = new Scanner(System.in);
  
  public String nombreDeHerramienta;
  public final int ID = rand.nextInt(1000);
  protected int cantidad;
  private boolean disponible = false;
  public Herramienta(String nombreDeHerramienta, int cantidad){
    this.nombreDeHerramienta = nombreDeHerramienta;
    this.cantidad = cantidad;
    if (cantidad > 0) disponible = true;
  }

  public void prestarHerramienta(int cantidad){
    if (this.cantidad - cantidad >= 0){
      System.out.println("Toma "+ cantidad + " " + nombreDeHerramienta);
      this.cantidad -= cantidad;
    }
    else{
      System.out.println("No tenemos "+ cantidad + " " + nombreDeHerramienta);
    }
    if (this.cantidad == 0) disponible = false;
  }

  public void devolverHerramienta(int cantidad){
    this.cantidad += cantidad;
    System.out.println("Devolviste " + cantidad + " "+ nombreDeHerramienta);
  }
}
