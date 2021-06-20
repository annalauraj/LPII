/*Escreva um algoritmo que leia e mostre um vetor de 20 elementos inteiros. A seguir, conte quantos valores pares
existem no vetor.*/

#include <stdio.h>
#include <stdlib.h>

int main(){
    int vet[20], i, par = 0;

    printf("Informe 20 elementos para o vetor:\n");
    for(i = 0; i < 20; i++){
        scanf("%d", &vet[i]);
    }
    for (i = 0; i < 20; i++){
        printf("\nVetor[%d]: %d\n", i, vet[i]);

        if (vet[i] % 2 == 0){
            par++;
        }
    }
    printf("\n\nExistem %d valores pares no vetor!\n", par);

    return 0;
}
