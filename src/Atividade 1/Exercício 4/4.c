/*Escreva um algoritmo que leia um vetor de 20 posições e mostre-o. Em seguida, troque o primeiro elemento com
o último, o segundo com o penúltimo, o terceiro com o antepenúltimo e assim sucessivamente. Mostre o novo
vetor depois da troca.*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vet[20], i, x;

    printf("Digite 20 elementos para o vetor:\n");
    for(i = 0; i < 20; i++){
        scanf("%d",&vet[i]);
    }
    printf("\nVETOR ORIGINAL:");
    for(i = 0; i < 20; i++){
        printf("\nVETOR[%d] = %d", i, vet[i]);
    }
    for(i = 0; i < 10; i++){
        x = vet[i];
        vet[i] = vet[19 - i];
        vet[19 - i] = x;
    }
    printf("\n\nVETOR APOS A TROCA SUCESSIVA:");
    for(i = 0; i < 20; i++){
        printf("\nVETOR[%d] = %d", i, vet[i]);
    }
    return 0;
}
