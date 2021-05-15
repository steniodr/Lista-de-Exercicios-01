#include <stdio.h>

int main(void) {

  int age, months, days, hours, minutes;

  printf("Digite a sua idade (Em anos): ");
  scanf("%d", &age);
  
  months = age * 12;
  days = age * 365;
  hours = age * 8760;
  minutes = age * 525600;
  
  printf("Meses: %d \n", months);
  printf("Dias: %d \n", days);
  printf("Horas: %d \n", hours);
  printf("Minutos: %d \n", minutes);
  
  return 0;
}
