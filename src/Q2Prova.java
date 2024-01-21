//Questão 2
//        (20 pontos)
//
//        Você está desenvolvendo um programa para uma concessionária que será responsável por dado o valor de um carro informar
//        quantas vezes ele poderia ser parcelado. O valor da parcela deve ser maior ou igual a 1000. Você deve receber o valor
//        do carro via entrada do usuário utilizando a classe Scanner do pacote java.util.

// Considerações: Se o valor da parcela é maior ou igual a 1000, caso tenha um resto da divisão por mil, uma das parcelas tem que ser maior que 1000, e somar o resto a esse valor,
// tendo em vista que não impõe a condição das parcelas serem iguais. Ou pode-se fazer parcelas iguais dividindo o valor do carro pelo valor inteiro da divisão por mil.

import java.util.Scanner;

public class Q2Prova {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, por gentileza, informe o valor do carro que deseja parcelar:");
        double valorCarro= entrada.nextDouble();

        double valorMinParcela = 1000.0;
        double resto = valorCarro % valorMinParcela;

        double numeroParcelas = (valorCarro/valorMinParcela);
        int numeroInteiroDeParcelas = (int) numeroParcelas;
        double valorParcela = valorCarro/numeroInteiroDeParcelas;

        if (numeroInteiroDeParcelas > 0 && resto == 0.0 && valorCarro >= 1000){
            System.out.println("O carro poderá ser pago em " + numeroParcelas + " parcelas de R$1000,00 cada");

        } else if (numeroParcelas > 0 && resto != 0.0 && valorCarro >= 1000){
            // Se quiser parcelas fixas de 1000 mais uma adicional que seja diferente de 1000 reais e acima disso:
            System.out.printf("O carro poderá ser pago em %d parcelas de R$1000,00 cada e mais 1 parcela de R$ %.2f.\n", (numeroInteiroDeParcelas - 1), (valorMinParcela+resto));
            // Se quiser parcelas fixas acima de 1000 reais iguais entre si:
            System.out.printf("Ou o carro poderá ser pago em %d parcelas iguais de R$ %.2f \n", (numeroInteiroDeParcelas),valorParcela);
        } else {
            System.out.println("Verifique por gentileza o valor do carro inserido, pois a parcela precisa ser de no mínimo R$1000,00 cada.");
        }


    }
}
