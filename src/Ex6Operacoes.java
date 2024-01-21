//Realizar uma operação matemática, que deve ser passada via input do usuário ( opções: + - / * ) entre dois números inteiros que também devem ser solicitados via System.in.
//        Caso a operação seja desconhecida exibir uma mensagem "Operação desconhecida" e encerrar o programa.
//
//        Exemplo:
//        ```language
//        Qual operação deseja fazer? ( opções: + - / * )
//        Informe o primeiro número.
//        Informe o segundo número.
//        ```

import java.util.Scanner;

public class Ex6Operacoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo à calculadora de operações matemáticas. Por gentileza, informe a operação desejada (opções: + - / *)");
        String operador = entrada.nextLine();
        System.out.println("Informe o primeiro número:");
        double numero1 = entrada.nextDouble();
        System.out.println("Informe o segundo número:");
        double numero2 = entrada.nextDouble();
        double resultado = 0;

        // Usando switch case (ele só dá invalido no final)

        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                // Verifica se o divisor não é zero para evitar uma divisão por zero.
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação desconhecida.");
        }

        System.out.println("Resultado: " + resultado);


    }
}
