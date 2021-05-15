import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#,###.0");
    double weight, weightGrams, newWeightGrams;

    System.out.printf("Digite o seu peso: ");
    weight = sc.nextDouble();
    
    weightGrams = weight * 1000;
    newWeightGrams = (weight + (weight * 5 / 100)) * 1000;
  
    System.out.println("Peso: " + df.format(weight));
    System.out.println("Peso em Gramas: " + df.format(weightGrams));
    System.out.println("Novo peso em Gramas: " + df.format(newWeightGrams));
  }
}
