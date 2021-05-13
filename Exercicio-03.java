import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int number, denominator, resul;

    System.out.printf("Digite o numerador: ");
    number = sc.nextInt();

    System.out.printf("Digite o denominador: ");
    denominator = sc.nextInt();
    
    resul = number % denominator;
    
    System.out.println("O resto da divisão é: " + resul);
  }
}
