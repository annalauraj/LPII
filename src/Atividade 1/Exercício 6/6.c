/*Escrever um algoritmo que leia 2 vetores X(10) e Y(10) e os escreva. Crie, a seguir, um vetor P, que seja:
a. A união de X com Y
b. A diferença entre X e Y
c. A soma entre X e Y
d. O produto entre X e Y
e. A interseção entre X e Y
Escreva o vetor P a cada operação.*/

#include <stdio.h>
#include <stdlib.h>

int main(){
    int i;
    int X[10] = {0,2,4,6,8,10,12,14,16,18};
    int Y[10] = {1,3,5,7,9,11,13,15,17,19};

    printf("Vetor X:\n");
    for (i = 0; i < 10; i++){
        printf("%d\n", X[i]);
    }

    printf("\nVetor Y:\n");
    for (i = 0; i < 10; i++){
        printf("%d\n", Y[i]);
    }

    printf("\na. A uniao de X com Y\n");
    for (i = 0; i < 10; i++){
        printf("%d\n", X[i]);
    }
    for (i = 0; i < 10; i++){
        printf("%d\n", Y[i]);
    }

    printf("\nb. A diferenca entre X e Y\n");
    for (i = 0; i < 10; i++){
        printf("%d\n", X[i] - Y[i]);
    }
    printf("\nc. A soma entre X e Y\n");
    for (i = 0; i < 10; i++){
        printf("%d\n", X[i] + Y[i]);
    }
    printf("\nd. O produto entre X e Y\n");
    for (i = 0; i < 10; i++){
        printf("%d\n", X[i] * Y[i]);
    }

/*Nao consegui fazer a Intersecao*/

return 0;
}
