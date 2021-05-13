#include <stdio.h>

int main(void) {

  int n1, n2;

  printf("Digite o primeiro numero: ");
  scanf("%d", &n1);

  printf("Digite o segundo numero: ");
  scanf("%d", &n2);
  
  if (n1 == n2){
      printf("Os numeros são iguais!");
  } else if (n1 < n2){
      printf("O primeiro numero [%d] é menor!", n1);
  } else{
      printf("O segundo numero [%d] é menor!", n2);
  }
  return 0;
}
