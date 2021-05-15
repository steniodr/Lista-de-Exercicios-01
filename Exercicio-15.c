#include <stdio.h>

int main(void) {

  float salePrice, purchasePrice, gain, gainPercentage;

  printf("Digite o valor de compra: ");
  scanf("%f", &purchasePrice);
  
  printf("Digite o valor de venda: ");
  scanf("%f", &salePrice);
  
  gain = salePrice - purchasePrice;
  gainPercentage = gain / purchasePrice * 100;
  
  
  printf("\nValor de Compra: %.2f \n", purchasePrice);
  printf("Valor de Venda: %.2f \n", salePrice);
  printf("Lucro Bruto: %.2f \n", gain);
  printf("Porcentagem de Lucro: %.0f%%", gainPercentage);
  
  return 0;
}
