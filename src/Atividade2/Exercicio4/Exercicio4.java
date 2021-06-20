package Atividade2.Exercicio4;

import java.util.Scanner;

/*Escreva um algoritmo que leia um vetor de 20 posições e mostre-o. Em seguida, troque o primeiro elemento com o último, o segundo com o penúltimo, o terceiro com o antepenúltimo e assim sucessivamente. Mostre o novo vetor depois da troca.*/

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vet = new int[20];
        int x;

        System.out.println("Digite 20 elementos para o vetor: ");
        for (int i = 0; i < 20; i++) {
            vet[i] = input.nextInt();
        }
        System.out.println("\nVETOR ORIGINAL: ");
        for (int i = 0; i < 20; i++) {
            System.out.print("\nVETOR[" + i + "] = " + vet[i]);
        }
        for (int i = 0; i < 10; i++) {
            x = vet[i];
            vet[i] = vet[19 - i];
            vet[19 - i] = x;
        }
        System.out.print("\n\nVETOR APOS A TROCA SUCESSIVA: ");
        for (int i = 0; i < 20; i++) {
            System.out.print("\nVETOR[" + i + "] = " + vet[i]);
        }
    }
}
