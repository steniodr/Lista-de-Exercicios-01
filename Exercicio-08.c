#include <stdio.h>

int main(void) {

  float value, rate, income, final;

  printf("Digite o valor do depósito: ");
  scanf("%f", &value);
  
  printf("Digite a taxa de juros (Valor em %%): ");
  scanf("%f", &rate);
  
  income = value * rate / 100;
  final = value + income;
  
  printf("Valor Depositado: %.2f\n", value);
  printf("Valor de Rendimento: %.2f\n", income);
  printf("Valor Total: %.2f\n", final);
  
  return 0;
}
