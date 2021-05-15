import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#,###.00");
    int hours;
    double hoursNormal, hoursExtra, total;

    System.out.printf("Digite a quantidade de horas trabalhada: ");
    hours = sc.nextInt();
    
    if (hours > 44) {
        hoursNormal =  44 * 20;
        hoursExtra = hours - 44;
        hoursExtra = hoursExtra * (20 + (20 * 50 / 100));
        total = hoursNormal + hoursExtra;
    } else {
        total = hours * 20;
    }
    
    System.out.println("\nSalário Final: " + df.format(total));
  }
}
