#include <stdio.h>

int main(void) {

  float fahrenheit, celsius;

  printf("Digite a temperatura em Fahrenheit: ");
  scanf("%f", &fahrenheit);
  
  celsius = ((fahrenheit - 32) * 5) / 9;
  
  printf("A temperatura em Celsius é: %.1f", celsius);
  
  return 0;
}
