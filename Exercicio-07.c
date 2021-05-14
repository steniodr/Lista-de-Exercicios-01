#include <stdio.h>

int main(void) {

  float n1, n2, avg;
  int p1, p2;

  printf("Digite a primeira nota: ");
  scanf("%f", &n1);
  
  printf("Digite o peso referente a essa nota: ");
  scanf("%d", &p1);
  
  printf("Digite a segunda nota: ");
  scanf("%f", &n2);
  
  printf("Digite o peso referente a essa nota: ");
  scanf("%d", &p2);
  
  avg = ((n1 * p1) + (n2 * p2)) / (p1 + p2);
  
  printf("A média ponderada é: %.2f", avg);
  
  return 0;
}
