package Atividade2.Exercicio7;

import java.util.Scanner;

/*Faça um algoritmo que leia um vetor V de 10 posições e, após, verifica se um número N,
fornecido pelo usuário, existe no vetor. Se existir, indicar a(s) posição(ões), senão escrever a
mensagem "O número fornecido não existe no vetor!". */

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vet = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int numero, posicao = 0;
        boolean existe = false;

        System.out.println("\nDigite um numero: ");
        numero = input.nextInt();

        for (int i = 0; i < 10; i++) {
            if (numero == vet[i]) {
                existe = true;
                posicao = i;
            }
        }
        if (existe) {
            System.out.println("\nO numero " + numero + " esta na posicao [" + posicao + "] do vetor!\n");
        } else {
            System.out.println("\nO numero fornecido nao existe no vetor!\n");
        }
    }
}
