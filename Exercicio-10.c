#include <stdio.h>

int main(void) {

  float salary, tax, total;

  printf("Digite o seu salário: ");
  scanf("%f", &salary);
  
  tax = (salary * 5 / 100);
  total = salary - tax;
  
  printf("\nSalário Bruto: %.2f \n", salary);
  printf("Imposto de Renda: %.2f \n", tax);
  printf("Salário Liquido: %.2f \n", total);
  
  return 0;
}
