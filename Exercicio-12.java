import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#,###.00");
    double basicSalary, quilowattsValue, total, totalWithDisc;
    int qtdequilowatts;

    System.out.printf("Digite o valor do salário minimo: ");
    basicSalary = sc.nextDouble();
    
    System.out.printf("Digite a quantidade de Quilowatts gasta: ");
    qtdequilowatts = sc.nextInt();
  
    quilowattsValue = basicSalary / 5;
    total = qtdequilowatts * quilowattsValue;
    totalWithDisc = total - (total * 15 / 100);
  
    System.out.println("Valor por Quilowatt:: " + df.format(quilowattsValue));
    System.out.println("Valor pago pela residencia: " + df.format(total));
    System.out.println("Valor com 15% de desconto: " + df.format(totalWithDisc));
  }
}
