#include <stdio.h>

int main(void) {

  float n1, n2, n3, avg;

  printf("Digite o valor da primeira nota: ");
  scanf("%f", &n1);

  printf("Digite o valor da segunda nota: ");
  scanf("%f", &n2);

  printf("Digite o valor da terceira nota: ");
  scanf("%f", &n3);

  printf("\n");
  avg = (n1 + n2 + n3) / 3;

  if (avg >= 7){
    printf("Aprovado!\n");
    printf("Media = %.2f", avg);
  } else {
    printf("Reprovado\n");
    printf("Media = %.2f", avg);
  }
  
  return 0;
}
