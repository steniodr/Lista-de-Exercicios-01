import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n1, n2;

    System.out.println("Digite o primeiro valor: ");
    n1 = sc.nextInt();

    System.out.println("Digite o segundo valor: ");
    n2 = sc.nextInt();
    
    if (n1 > n2){
        System.out.println("O primeiro numero [" + n1 + "] é maior!\n");
    } else if (n2 > n1) {
        System.out.println("O primeiro numero [" + n2 + "] é maior!\n");
    } else {
        System.out.println("Os numeros são iguais!\n");
    }
  }
}
