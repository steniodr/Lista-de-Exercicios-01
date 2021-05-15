#include <stdio.h>

int main(void) {

  float salary, increase, total;

  printf("Digite o seu salário: ");
  scanf("%f", &salary);
  
  increase = (salary * 25 / 100);
  total = salary + increase;
  
  printf("\nSalário anterior: %.2f \n", salary);
  printf("Valor aumento: %.2f \n", increase);
  printf("Salário novo: %.2f \n", total);
  
  return 0;
}
