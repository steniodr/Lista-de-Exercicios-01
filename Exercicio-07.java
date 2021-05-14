import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#,###.00");
    double n1, n2, avg;
    int p1, p2;

    System.out.printf("Digite a primeira nota: ");
    n1 = sc.nextDouble();
  
    System.out.printf("Digite o peso referente a essa nota: ");
    p1 = sc.nextInt();
      
    System.out.printf("Digite a segunda nota: ");
    n2 = sc.nextDouble();
      
    System.out.printf("Digite o peso referente a essa nota: ");
    p2 = sc.nextInt();
    
    
    avg = ((n1 * p1) + (n2 * p2)) / (p1 + p2);
    
    System.out.printf("A média ponderada é: " + df.format(avg));
  }
}
