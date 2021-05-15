import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#,###.00");
    DecimalFormat df2 = new DecimalFormat("#,###");
    double salePrice, purchasePrice, gain, gainPercentage;

    System.out.printf("Digite o valor de compra: ");
    purchasePrice = sc.nextDouble();
    
    System.out.printf("Digite o valor de venda: ");
    salePrice = sc.nextDouble();
    
    gain = salePrice - purchasePrice;
    gainPercentage = gain / purchasePrice * 100;
  
    System.out.println("\nValor de Compra: " + df.format(purchasePrice));
    System.out.println("Valor de Venda: " + df.format(salePrice));
    System.out.println("Lucro Bruto: " + df.format(gain));
    System.out.println("Porcentagem de Lucro: " + df2.format(gainPercentage) + "%");
  }
}
