import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n1, n2, n3;

    System.out.println("Digite o primeiro valor: ");
    n1 = sc.nextInt();

    System.out.println("Digite o segundo valor: ");
    n2 = sc.nextInt();
    
    System.out.println("Digite o terceiro valor: ");
    n3 = sc.nextInt();
    
    if (n1 > n2 && n1 > n3){
      System.out.printf("O primeiro numero [" + n1 + "] é maior!");
  } else if (n2 > n1 && n2 > n3){
      System.out.printf("O segundo numero [" + n2 + "] é maior!");
  } else{
      System.out.printf("O terceiro numero [" + n3 + "] é maior!");
  }
  }
}
