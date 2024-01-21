//Faça um programa que receba as quatro notas de 0 a 10 de um aluno e informe a média das notas. Caso receba notas maiores que 10 ou menores que zero é para retornar uma mensagem informando que valor é inválido e encerrar o programa.
//
//
//        Exemplo:
//
//        ```language
//        Informe a nota prova 1:
//        10
//        Informe a nota prova 2:
//        10
//        Informe a nota prova 3:
//        5
//        Informe a nota prova 4:
//        5
//        A média do aluno foi 7.5
//        ```


import java.util.Scanner;

public class Ex2NotasMedia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a nota da prova 1:");
        double nota1 = entrada.nextDouble();
        System.out.println("Informe a nota da prova 2:");
        double nota2 = entrada.nextDouble();
        System.out.println("Informe a nota da prova 3:");
        double nota3 = entrada.nextDouble();
        System.out.println("Informe a nota da prova 4:");
        double nota4 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota4 + nota4)/4;

        System.out.println("A média do aluno foi " + media);


    }
}
