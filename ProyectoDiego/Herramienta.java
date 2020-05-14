import java.util.Random;
import java.util.Scanner;

public class Herramienta{
  Random rand = new Random();
  Scanner scan = new Scanner(System.in);
  
  public String nombreDeHerramienta;
  public final ID = rand.ints(0,1000);
  protected int cantidad;
  private boolean disponible;
  public Herramienta(){
    nombreDeHerramienta = "";
    cantidad = 0;
    disponible = false;
  }

  public void registrarHerramienta(){
    System.out.println("Pon el nombre de la herramienta\n");
    nombreDeHerramienta = scan.next();
    System.out.println("Ingresa la cantidad de " + nombreDeHerramienta + " que registras\n");
    cantidad += scan.nextInt();
    if (cantidad > 0){
      disponible = true;
    }
  }

  public void prestarHerramienta(int cantidad){
    if (this.cantidad - cantidad >= 0){
      System.out.println("Toma "+ cantidad + " " + nombreDeHerramienta);
      this.cantidad -= cantidad;
    }
    else{
      System.out.println("No tenemos "+ cantidad + " " + nombreDeHerramienta);
    }
    if (this.cantidad == 0) disponible = false
  }

  public void devolverHerramienta(int cantidad){
    this.cantidad += cantidad;
    System.out.println("Devolviste " + cantidad + " "+ nombreDeHerramienta);
  }
}
