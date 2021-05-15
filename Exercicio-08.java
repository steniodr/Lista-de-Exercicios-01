import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#,###.00");
    double value, rate, income, total;;

    System.out.printf("Digite o valor do depósito: ");
    value = sc.nextDouble();
  
    System.out.printf("Digite a taxa de juros (Valor em %%): ");
    rate = sc.nextDouble();
      
    income = value * rate / 100;
    total = value + income;
  
    System.out.printf("Valor Depositado: " + df.format(value) + "\n");
    System.out.printf("Valor de Rendimento: " + df.format(income) + "\n");
    System.out.printf("Valor Total: " + df.format(total) + "\n");
  }
}
