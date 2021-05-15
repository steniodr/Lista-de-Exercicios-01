import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int yearBirth, yearActual, age, ageWeeks;

    System.out.printf("Digite o seu ano de nascimento: ");
    yearBirth = sc.nextInt();
    
    System.out.printf("Digite o seu ano atual: ");
    yearActual = sc.nextInt();
  
    age = yearActual - yearBirth;
    ageWeeks = age * 52143;
  
    System.out.println("\nIdade atual: " + age);
    System.out.println("Idade em Semanas: " + ageWeeks);
  }
}
