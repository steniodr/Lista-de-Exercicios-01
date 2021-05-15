import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#,###.00");
    double salary, increase, total;

    System.out.printf("Digite o seu salário: ");
    salary = sc.nextDouble();
  
    increase = (salary * 25 / 100);
    total = salary + increase;
  
    System.out.println("Salário antigo: " + df.format(salary));
    System.out.println("Valor aumento: " + df.format(increase));
    System.out.println("Salário novo: " + df.format(total));
  }
}
