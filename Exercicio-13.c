#include <stdio.h>

int main(void) {

  float weight, weightGrams, newWeightGrams;

  printf("Digite o seu peso: ");
  scanf("%f", &weight);
  
  weightGrams = weight * 1000;
  newWeightGrams = (weight + (weight * 5 / 100)) * 1000;
  
  printf("\nPeso: %.1f \n", weight);
  printf("Peso em Gramas: %.1f \n", weightGrams);
  printf("Novo peso em Gramas: %.1f \n", newWeightGrams);
  
  return 0;
}
