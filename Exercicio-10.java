import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#,###.00");
    double salary, tax, total;

    System.out.printf("Digite o seu salário: ");
    salary = sc.nextDouble();
  
    tax = (salary * 5 / 100);
    total = salary - tax;
  
    System.out.println("Salário Bruto: " + df.format(salary));
    System.out.println("Imposto de Renda: " + df.format(tax));
    System.out.println("Salário Liquido: " + df.format(total));
  }
}
