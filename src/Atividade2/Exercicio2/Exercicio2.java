package Atividade2.Exercicio2;

import java.util.Scanner;

/*Escreva um algoritmo que leia dois vetores de 10 posições e faça a multiplicação dos elementos de mesmo índice,
colocando o resultado em um terceiro vetor. Mostre o vetor resultante.*/


public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetA = new int[10], vetB = new int[10], vetC = new int[10];

        System.out.println("Digite os valores do VETOR A:");
        for (int i = 0; i < 10; i++) {
            vetA[i] = input.nextInt();
        }
        System.out.println("\nDigite os valores do VETOR B:");
        for (int i = 0; i < 10; i++) {
            vetB[i] = input.nextInt();
        }
        System.out.println("\nVETOR A X VETOR B = VETOR C");
        for (int i = 0; i < 10; i++) {
            vetC[i] = vetA[i] * vetB[i];
            System.out.println(vetA[i] + " X " + vetB[i] + " = " + vetC[i]);
        }

    }
}
