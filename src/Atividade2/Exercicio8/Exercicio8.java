package Atividade2.Exercicio8;

import java.util.Scanner;

/*Escreva um algoritmo que leia um vetor de 15 elementos inteiros. Ordene o vetor em ordem decrescente e exiba-o.*/

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vet = new int[15];
        int X;

        System.out.println("Digite 15 elementos para armazena-los no vetor:");

        for (int i = 0; i < 15; i++) {
            vet[i] = input.nextInt();
        }
        for (int i = 0; i < 15; i++) {
            for (int j = i; j < 15; j++) {
                if (vet[i] < vet[j]) {
                    X = vet[i];
                    vet[i] = vet[j];
                    vet[j] = X;
                }
            }
        }
        System.out.println("\nVETOR EM ORDEM DECRESCENTE:");

        for (int i = 0; i < 15; i++) {
            System.out.println("Posicao[" + i + "]: " + vet[i]);
        }
    }
}
