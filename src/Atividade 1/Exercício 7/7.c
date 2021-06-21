/*Fa�a um algoritmo que leia um vetor V de 10 posi��es e, ap�s, verifica se um n�mero N,
fornecido pelo usu�rio, existe no vetor. Se existir, indicar a(s) posi��o(�es), sen�o escrever a
mensagem "O n�mero fornecido n�o existe no vetor!". */


#include <stdio.h>
#include <stdlib.h>

int main(){
    int vet[10] = {20,21,22,23,24,25,26,27,28,29,30}, i, numero, posicao = 0, existe = 0;

    printf("\nDigite um numero: \n");
    scanf("%d", &numero);

    for(i = 0; i < 10; i++){
        if (numero == vet[i]){
            existe = 1;
            posicao = i;
        }
    }
    if (existe == 1){
        printf("\nO numero %d esta na posicao [%d] do vetor!\n", numero, posicao);
    }
    else{
        printf("\nO numero fornecido nao existe no vetor!\n");
    }

    return 0;
}
