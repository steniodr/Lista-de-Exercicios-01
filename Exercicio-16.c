#include <stdio.h>
#include <math.h>

int main(void) {

  int n;
  float P, i, M, gainGross, IOF, gainNet, gainPercentage;

  printf("Digite o valor de P (Aplicação): ");
  scanf("%f", &P);
  
  printf("Digite o valor de i (Taxa de Juros): ");
  scanf("%f", &i);
  
  printf("Digite o valor de n (Periodo em meses): ");
  scanf("%d", &n);
  
  M = P * (pow((1 + i/100), n));
  gainGross = M - P;
  IOF = gainGross * 5 / 100;
  gainNet = gainGross - IOF;
  gainPercentage = gainNet / P * 100;
  
  
  printf("\nValor do Montante: %.2f \n", M);
  printf("Lucro Bruto: %.2f \n", gainGross);
  printf("Valor de IOF: %.2f \n", IOF);
  printf("Lucro Liquido: %.2f \n", gainNet);
  printf("Porcentagem de Lucro Liquido: %.0f%%", gainPercentage);
  
  return 0;
}
