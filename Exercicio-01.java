import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#,###.00");
    double n1, n2, n3, avg;

    System.out.println ("Digite o valor da primeira nota: ");
    n1 = sc.nextDouble ();

    System.out.println ("Digite o valor da segunda nota: ");
    n2 = sc.nextDouble ();

    System.out.println ("Digite o valor da terceira nota: ");
    n3 = sc.nextDouble ();

    System.out.println("\n");
    avg = (n1 + n2 + n3) / 3;

    if (avg >= 7)
      {
	    System.out.println("Aprovado!");
	    System.out.println("Media = " + df.format(avg));
      }
    else
      {
	    System.out.println("Reprovado");
	    System.out.println("Media = " + df.format(avg));
      }
  }
}
