#include <stdio.h>

int main(void) {

  float basicSalary, quilowattsValue, total, totalWithDisc;
  int qtdequilowatts;

  printf("Digite o valor do salário minimo: ");
  scanf("%f", &basicSalary);
  
  printf("Digite a quantidade de Quilowatts gasta: ");
  scanf("%d", &qtdequilowatts);
  
  quilowattsValue = basicSalary / 5;
  total = qtdequilowatts * quilowattsValue;
  totalWithDisc = total - (total * 15 / 100);
  
  printf("\nValor por Quilowatt: %.2f \n", quilowattsValue);
  printf("Valor pago pela residencia: %.2f \n", total);
  printf("Valor com 15%% de desconto: %.2f \n", totalWithDisc);
  
  return 0;
}
