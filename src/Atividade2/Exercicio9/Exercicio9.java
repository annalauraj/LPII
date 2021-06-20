package Atividade2.Exercicio9;

import java.util.Scanner;

/*Dado um número indeterminado de funcionários, onde é fornecido o Nome, número de dependentes e o número de horas trabalhadas. Pede-se que seja impresso, para cada funcionário, o seu Nome, salário bruto, salário líquido e o valor descontado. A empresa, paga R$ 100,00 por
hora de trabalho, e R$ 125,55 por dependente, e ainda faz um desconto de 12% sobre o salário bruto. Pede-se ainda que seja impresso o total de funcionários da empresa, o total gasto com salários, e o total descontado.*/

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        int nr_dependentes = 0, nr_horas_trabalhadas = 0, qtd_funcionarios = 0;
        float salario_bruto = 0, salario_liquido = 0, total_salarios = 0, total_descontado = 0;

        do {
            System.out.println("\nInforme o nome completo ou (digite ENTER para parar o programa): ");
            nome = input.next();

            if (nome.length() > 2) {
                System.out.println("Informe o numero de dependentes: ");
                nr_dependentes = input.nextInt();

                System.out.println("Informe o numero de horas trabalhadas: ");
                nr_horas_trabalhadas = input.nextInt();

                salario_bruto = (float) ((nr_horas_trabalhadas * 100) + (nr_dependentes * 125.55));
                salario_liquido = (float) (salario_bruto - (salario_bruto * 0.12));

                qtd_funcionarios++;
                total_salarios = total_salarios + salario_bruto;
                total_descontado = (float) (total_descontado + (salario_bruto * 0.12));

                System.out.println("\nNome: " + nome);
                System.out.println("Salario Bruto: R$ " + salario_bruto);
                System.out.println("Salario Liquido: R$ " + salario_liquido);
                System.out.println("Valor Descontado: R$ " +(salario_bruto - salario_liquido));
            }
        } while (nome.length() > 2);

        System.out.println("RESUMO DA EMPRESA:");
        System.out.println("Total de Funcionarios da Empresa: " + qtd_funcionarios);
        System.out.println("Total gasto com salarios: " + total_salarios);
        System.out.println("Total descontado de todos os salarios: " + total_descontado);
    }
}