import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#,###.0");
    double fahrenheit, celsius;

    System.out.printf("Digite a temperatura em Fahrenheit: ");
    fahrenheit = sc.nextDouble();
    
    celsius = ((fahrenheit - 32) * 5) / 9;
    
    System.out.printf("A temperatura em Celsius é: " + df.format(celsius));
  }
}
