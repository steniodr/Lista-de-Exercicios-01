#include <stdio.h>

int main(void) {

  int yearBirth, yearActual, age, ageWeeks;

  printf("Digite o seu ano de nascimento: ");
  scanf("%d", &yearBirth);
  
  printf("Digite o seu ano atual: ");
  scanf("%d", &yearActual);
  
  age = yearActual - yearBirth;
  ageWeeks = age * 52143;
  
  
  printf("\nIdade atual: %d \n", age);
  printf("Idade em Semanas: %d \n", ageWeeks);
  
  return 0;
}
