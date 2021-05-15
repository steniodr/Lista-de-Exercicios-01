import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int age, months, days, hours, minutes;

    System.out.printf("Digite a sua idade (Em anos): ");
    age = sc.nextInt();
  
    months = age * 12;
    days = age * 365;
    hours = age * 8760;
    minutes = age * 525600;
  
    System.out.println("Meses: " + months);
    System.out.println("Dias: " + days);
    System.out.println("Horas: " + hours);
    System.out.println("Minutos: " + minutes);
  }
}
