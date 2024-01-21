import java.util.Scanner;

//Faça um programa que peça para o usuário quantas provas eles fez, depois pergunte para ele a nota inteira, de 0 a 100, de cada prova, e retorne a média, a maior nota e a menor nota entre as provas informadas. Exemplo:
//
//        ```language
//        Informe a quantidade de provas:
//        5
//        Informe a nota da prova 1:
//        75
//        Informe a nota da prova 2:
//        60
//        Informe a nota da prova 3:
//        50
//        Informe a nota da prova 4:
//        80
//        Informe a nota da prova 5:
//        90
//        A menor nota é: 50
//        A maior nota é: 90
//        A média das notas é: 71
//        ```
public class Ex9Provas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de provas:");
        int qtdeProvas = entrada.nextInt();

        double [] notas= new double[qtdeProvas];
        double soma = 0;
        double menorNota = 100;
        double maiorNota = 0;

        for (int i = 0; i < qtdeProvas; i++){

            System.out.println("Informe a nota da Prova " + (i + 1));
            notas[i] = entrada.nextDouble();
            soma = soma + notas[i];

            if (notas[i]>maiorNota) {
                maiorNota = notas[i];
            }

            if (notas[i]<menorNota){
                menorNota = notas[i];
            }

        }

        double media = (soma/qtdeProvas);

        System.out.println("A média é " + media);
        System.out.println("A menor nota é " + menorNota);
        System.out.println("A maior nota é " + maiorNota);
    }
}
