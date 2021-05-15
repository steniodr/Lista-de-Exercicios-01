#include <stdio.h>

int main(void) {

  int hours, hoursNormal;
  float hoursExtra, total;

  printf("Digite a quantidade de horas trabalhada: ");
  scanf("%d", &hours);
  
  if (hours > 44) {
    hoursNormal =  44 * 20;
    hoursExtra = hours - 44;
    hoursExtra = hoursExtra * (20 + (20 * 50 / 100));
    total = hoursNormal + hoursExtra;
  } else {
      total = hours * 20;
  }
  
  printf("Salário Final: %.2f", total);
  
  return 0;
}
