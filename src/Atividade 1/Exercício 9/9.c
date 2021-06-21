/*Dado um número indeterminado de funcionários, onde é fornecido o Nome, número de
dependentes e o número de horas trabalhadas. Pede-se que seja impresso, para cada funcionário,
o seu Nome, salário bruto, salário líquido e o valor descontado. A empresa, paga R$ 100,00 por
hora de trabalho, e R$ 125,55 por dependente, e ainda faz um desconto de 12% sobre o salário
bruto. Pede-se ainda que seja impresso o total de funcionários da empresa, o total gasto com
salários, e o total descontado.*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
    char nome[1000];
    int nr_dependentes = 0, nr_horas_trabalhadas = 0, qtd_funcionarios = 0;
    float salario_bruto = 0, salario_liquido = 0, total_salarios = 0, total_descontado = 0;

    do{
        printf("\nInforme o nome completo ou (digite ENTER para parar o programa): ");
        fflush(stdin);
        gets(nome);

        if(strlen(nome) > 2){
            printf("Informe o numero de dependentes: ");
            scanf("%d", &nr_dependentes);
            printf("Informe o numero de horas trabalhadas: ");
            scanf("%d", &nr_horas_trabalhadas);

            salario_bruto = (nr_horas_trabalhadas * 100) + (nr_dependentes * 125.55);
            salario_liquido = salario_bruto - (salario_bruto * 0.12);

            qtd_funcionarios++;
            total_salarios = total_salarios + salario_bruto;
            total_descontado = total_descontado + (salario_bruto * 0.12);

            printf("\nNome: %s\n", nome);
            printf("Salario Bruto: R$ %.2f\n", salario_bruto);
            printf("Salario Liquido: R$ %.2f\n", salario_liquido);
            printf("Valor Descontado: R$ %.2f\n", (salario_bruto - salario_liquido));
        }
    }while(strlen(nome) > 2);

    printf("\n\nRESUMO DA EMPRESA:\n");
    printf("Total de Funcionarios da Empresa: %d\n", qtd_funcionarios);
    printf("Total gasto com salarios: %.2f\n", total_salarios);
    printf("Total descontado de todos os salarios: %.2f\n", total_descontado);

    return 0;
}
