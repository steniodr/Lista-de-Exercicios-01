#include <stdio.h>

int main(void) {

  int number, denominator, resul;

  printf("Digite o numerador: ");
  scanf("%d", &number);

  printf("Digite o denominador: ");
  scanf("%d", &denominator);

  resul = number % denominator;

  printf("O resto da divisão é: %d", resul);
  
  return 0;
}
