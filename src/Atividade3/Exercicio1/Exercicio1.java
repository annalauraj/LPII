package Atividade3.Exercicio1;

import java.util.Scanner;

/*1. Faça um programa que, a partir de uma string digitada pelo usuário, imprima:
        a) O número de caracteres da string.
        b) A string com todas suas letras em maiúsculo.
        c) O número de vogais da string.
        d) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas).
        e) Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).
        f) O número de dígitos (0 a 9) da string.
        g) Se a string é um palíndromo ou não.*/

public class Exercicio1 {

    public static void main(String[] args) {

        String texto;
        int vogal = 0, digitos = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        texto = ler.nextLine();

        System.out.println("\na) O número de caracteres da string: " + texto.length());

        System.out.println("\nb) A string com todas suas letras em maiúsculo: " + texto.toUpperCase());

        for (int i = 0; i < texto.length(); i++){
            char elem = texto.charAt(i);
            if (elem == 'A' || elem == 'a' || elem == 'E' || elem == 'e' || elem == 'I' || elem == 'i' || elem == 'O' || elem == 'o' || elem == 'U' || elem == 'u'){
                vogal++;
            }
        }
        System.out.println("\nc) O número de vogais da string: " + vogal);

        System.out.println("\nd) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas): " +texto.toLowerCase().startsWith("uni"));

        System.out.println("\ne) Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas): " +texto.toLowerCase().endsWith("rio"));

        for (int i =0; i < texto.length(); i++){
            if(Character.isDigit(texto.charAt(i))){
                digitos++;
            }
        }
        System.out.println("\nf) O número de dígitos (0 a 9) da string: " + digitos);

        System.out.println("\ng) Se a string é um palíndromo ou não: ");

        StringBuilder texto2 = new StringBuilder(texto);

        if(texto.equals(texto2.reverse().toString())){
            System.out.println("É um palíndromo!");
        }
        else{
            System.out.println("Não é um palíndromo!\n");
        }
    }
}
