import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#,###.00");
    DecimalFormat df2 = new DecimalFormat("#,###");
    double P, i, M, gainGross, IOF, gainNet, gainPercentage;
    int n;

    System.out.printf("Digite o valor de P (Aplicação): ");
    P = sc.nextDouble();
    
    System.out.printf("Digite o valor de i (Taxa de Juros): ");
    i = sc.nextDouble();
    
    System.out.printf("Digite o valor de n (Periodo em meses): ");
    n = sc.nextInt();
    
    M = P * (Math.pow((1 + i/100), n));
    gainGross = M - P;
    IOF = gainGross * 5 / 100;
    gainNet = gainGross - IOF;
    gainPercentage = gainNet / P * 100;
    
    System.out.println("\nValor do Montante: " + df.format(M));
    System.out.println("Lucro Bruto: " + df.format(gainGross));
    System.out.println("Valor de IOF: " + df.format(IOF));
    System.out.println("Lucro Liquido: " + df.format(gainNet));
    System.out.println("Porcentagem de Lucro Liquido: " + df2.format(gainPercentage) + "%");
  }
}
