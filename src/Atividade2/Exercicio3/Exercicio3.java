package Atividade2.Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

/*Escreva um algoritmo que leia um vetor de 10 elementos inteiros. Encontre e mostre o menor elemento e a sua
posição.*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vet = new int[10];
        int posicao = 300, menor = 300;

        System.out.println("Digite 10 elementos para o vetor: ");
        for (int i = 0; i < 10; i++) {
            vet[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
                posicao = i;
            }
        }
        System.out.println("\nO menor elemento do vetor eh " + menor + " localizado na posicao [" + posicao + "]");

    }
}
