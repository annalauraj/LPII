package Atividade2.Exercicio1;

import java.util.Scanner;

/*Escreva um algoritmo que leia e mostre um vetor de 20 elementos inteiros. A seguir, conte quantos valores pares
existem no vetor.*/

public class Exercicio1 {

    public static void main(String[] args) {
        int[] vet = new int[20];
        int par = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe 20 elementos para o vetor:");
        for (int i = 0; i < 20; i++) {
            vet[i] = input.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Vetor[" + i + "]: " + vet[i]);

            if (vet[i] % 2 == 0) {
                par++;
            }
        }
        System.out.println("Existem " + par + " valores pares no vetor!\n");
    }
}

