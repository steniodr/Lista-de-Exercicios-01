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
    
    if (n1 == n2){
        System.out.println("Os numeros são iguais!\n");
    } else if (n1 < n2) {
        System.out.println("O primeiro numero [" + n1 + "] é menor!\n");
    } else {
        System.out.println("O segundo numero [" + n2 + "] é menor!\n");
    }
  }
}
