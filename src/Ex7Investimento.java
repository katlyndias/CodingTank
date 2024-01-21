//Pergunte para a usuária o valor que será investido em uma aplicação, a taxa de juros ao mês e o tempo que o dinheiro ficará aplicado.
//
//        Seu programa deverá exibir quanto de juros será pago e o saldo total em cada mês.
//
//        Exemplo:
//
//        ```language
//        Informe o valor inicial investido em R$.
//        10000,00
//        Informe o juros ao mês em %.
//        5
//        Informe o tempo em meses que o dinheiro ficará investido.
//        3
//
//        10000.0 reais, 5% de juros ao mês por 3 meses.
//
//        Mês 1: Juros: R$ 500.0 , saldo: 10500.0
//        Mês 2: Juros: R$ 525.0 , saldo: 11025.0
//        Mês 3: Juros: RS 551.25 , saldo: 11576.25

import java.util.Scanner;

public class Ex7Investimento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor inicial investido em R$:");
        double valorInvestido = entrada.nextDouble();
        System.out.println("Informe o juros ao mês em %:");
        double taxaJuros = entrada.nextDouble();
        System.out.println("Informe o tempo em meses que o dinheiro ficará investido:");
        double meses = entrada.nextDouble();


        for (int i = 1; i <= meses; i++) {
            double juros = (valorInvestido) * (taxaJuros / 100);
            valorInvestido += juros;

            System.out.printf("Mês %d: Juros: R$ %.2f , saldo: R$ %.2f\n", i, juros, valorInvestido);
        }
    }
}
