/*Escreva um algoritmo que leia dois vetores de 10 posições e faça a multiplicação dos elementos de mesmo índice,
colocando o resultado em um terceiro vetor. Mostre o vetor resultante.*/


#include <stdio.h>
#include <stdlib.h>

int main(){

    int vet_A[10], vet_B[10], vet_C[10], i;

    printf("Digite os valores do VETOR A:\n");
    for(i = 0; i < 10; i++){
        scanf("%d", &vet_A[i]);
    }
    printf("\nDigite os valores do VETOR B:\n");
    for(i = 0; i < 10; i++){
        scanf("%d", &vet_B[i]);
    }
    printf("\nVETOR A X VETOR B = VETOR C\n");
    for(i = 0; i < 10; i++){
        vet_C[i] = vet_A[i] * vet_B[i];
        printf("%d X %d = %d\n", vet_A[i], vet_B[i], vet_C[i]);
    }
    return 0;
}
