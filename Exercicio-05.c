#include <stdio.h>

int main(void) {

  int n1, n2, n3;

  printf("Digite o primeiro valor: ");
  scanf("%d", &n1);

  printf("Digite o segundo valor: ");
  scanf("%d", &n2);
  
  printf("Digite o terceiro valor: ");
  scanf("%d", &n3);
  
  if (n1 > n2 && n1 > n3){
      printf("O primeiro numero [%d] é maior!", n1);
  } else if (n2 > n1 && n2 > n3){
      printf("O segundo numero [%d] é maior!", n2);
  } else{
      printf("O terceiro numero [%d] é maior!", n3);
  }
  return 0;
}
