/*Escreva um algoritmo que leia um vetor de 15 elementos inteiros. Ordene o vetor em ordem decrescente e exiba-o.*/


#include <stdio.h>
#include <stdlib.h>

int main(){
    int vet[15], i, j, X;

    printf("Digite os valores para armazena-los no vetor: \n");
    for(i = 0; i < 15; i++){
        scanf("%d", &vet[i]);
    }
    for (i = 0; i < 15; i++){
        for(j = i; j < 15; j++){
            if (vet[i] < vet[j]){
                X = vet[i];
                vet[i] = vet[j];
                vet[j] = X;
            }
        }
    }
    printf("\nVETOR EM ORDEM DECRESCENTE:\n");
    for (i = 0; i < 15; i++){
        printf("Posicao [%d]: %d\n", i, vet[i]);
    }
    return 0;
}
