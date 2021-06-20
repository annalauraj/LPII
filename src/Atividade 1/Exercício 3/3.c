/*Escreva um algoritmo que leia um vetor de 10 elementos inteiros. Encontre e mostre o menor elemento e a sua
posição.*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vet[10], i, posicao = 300, menor = 300;

    printf("Digite 10 elementos para o vetor: \n");
    for (i = 0; i < 10; i++){
        scanf("%d", &vet[i]);
    }
    for (i = 0; i < 10; i++){
        if (vet[i] < menor){
            menor = vet[i];
            posicao = i;
        }
    }
    printf("\nO menor elemento do vetor eh %d localizado na posicao [%d]\n", menor, posicao);

    return 0;
}
