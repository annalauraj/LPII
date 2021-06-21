/*Escreva um algoritmo que leia um vetor de 6 elementos inteiros, que é o resultado da loteria esportiva. Leia a
seguir, para um total de 5 apostadores, o número do seu cartão e um vetor de respostas de 6 posições. Verifique
para cada apostador o número de acertos, comparando com o vetor de resultado. Escreva o número do apostador e
o número de acertos. Mostrar a mensagem “ Ganhador” para o apostador que tiver mais acertos.*/


/*Sendo bem sincera não entendi ao certo o enunciado da questão, me perdi no caminho ao tentar resolver, no final das contas olhei o vídeo da resolução do professor e fiz igual*/


#include <stdio.h>
#include <stdlib.h>

int main()
{
    int resultado_loteria[6] = {1,3,5,7,9,11};
    int i, j, k, ganhador = 0, maiorAcertos = 0;
    int cartoes[5][8] = {
        {1234,1,2,7,8,11,15,0},
        {2143,2,4,6,8,10,12,0},
        {3124,3,4,5,8,9,11,0},
        {2413,4,5,6,9,12,13,0},
        {1432,5,7,8,10,11,14,0},
    };

    for(i = 0; i < 5; i++){
        printf("Cartao numero: %d ", cartoes[i][0]);

        for(j = 1; j < 7; j++){
            int sorteado = 0;
            int numCompara = cartoes[i][j];
            for(k = 0; k < 6; k++){
                if(numCompara == resultado_loteria[k]){
                    sorteado = 1;
                    break;
                }
            }
            if (sorteado == 1){
                cartoes[i][7]++;
            }
        }
        printf(" Total de Acertos: %d\n", cartoes[i][7]);
    }

    for(i = 0; i < 5; i++){
        if(cartoes[i][7] > maiorAcertos){
            maiorAcertos = cartoes[i][7];
            ganhador = cartoes[i][0];
        }
    }
    printf("\n\nO Cartao de numero: %d atingiu o maior numero de acertos e foi o GANHADOR!!!\n", ganhador);

    return 0;
}
