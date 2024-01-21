//Criar uma função que transforma o valor de uma temperatura em graus celsius em fahrenheit seguindo a fórmula abaixo:
//
//        > fahrenheit = (celsius * fator1) + fator2
//
//        > fator1 é representado pela divisão de 9 por 5
//
//        > fator2 é 32
//
//        celcius é o valor variável da temperatura em celsius.
//
//        O seu programa deve calcular o valor em fahrenheit de ao menos duas temperaturas distintas e deve imprimir o resultado no console.
//        Exemplo:
//        ```language
//        Temperatura 1 XºC são YºF
//        Temperatura 2 ZºC são WºF


import java.util.Scanner;

public class Ex3Temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe as duas temperaturas em ºC para transformá-las para ºF");
        double celsius1 = entrada.nextDouble();
        double celsius2 = entrada.nextDouble();

        double fator1 = 1.8;
        double fator2 = 32;

        double fahreinheit1 = (celsius1 * fator1) + fator2;
        double fahreinheit2 = (celsius2 * fator1) + fator2;

        System.out.println("Temperatura  1 " + celsius1 + "ºC são " + fahreinheit1 + "°F");
        System.out.println("Temperatura  2 " + celsius2 + "ºC são " + fahreinheit2 + "°F");


    }

}
