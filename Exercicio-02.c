#include <stdio.h>

int main()
{
    int n1, n2;
    
    printf("Digite o primeiro número: ");
    scanf("%d", &n1);
    
    printf("Digite o segundo número: ");
    scanf("%d", &n2);
    
    if (n1 > n2){
        printf("O primeiro numero [%d] é maior!\n", n1);
    } else if (n2 > n1){
        printf("O segundo numero [%d] é maior!\n", n2);
    } else{
        printf("Os numeros são iguais!\n");
    }

    return 0;
}
