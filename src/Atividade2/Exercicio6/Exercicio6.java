package Atividade2.Exercicio6;

import java.util.Scanner;

/*Escrever um algoritmo que leia 2 vetores X(10) e Y(10) e os escreva. Crie, a seguir, um vetor P, que seja:
a. A união de X com Y
b. A diferença entre X e Y
c. A soma entre X e Y
d. O produto entre X e Y
e. A interseção entre X e Y
Escreva o vetor P a cada operação.*/

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] X = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
        int[] Y = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        System.out.println("Vetor X:");
        for (int i = 0; i < 10; i++) {
            System.out.println(X[i]);
        }
        System.out.println("\nVetor Y:");
        for (int i = 0; i < 10; i++) {
            System.out.println(Y[i]);
        }
        System.out.println("\na. A uniao de X com Y");
        for (int i = 0; i < 10; i++) {
            System.out.println(X[i]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Y[i]);
        }
        System.out.println("\nb. A diferenca entre X e Y");
        for (int i = 0; i < 10; i++) {
            System.out.println(X[i] - Y[i]);
        }
        System.out.println("\nc. A soma entre X e Y");
        for (int i = 0; i < 10; i++) {
            System.out.println(X[i] + Y[i]);
        }
        System.out.println("\nd. O produto entre X e Y");
        for (int i = 0; i < 10; i++) {
            System.out.println(X[i] * Y[i]);
        }
        /*Não consegui fazer a Interseção*/
    }
}
