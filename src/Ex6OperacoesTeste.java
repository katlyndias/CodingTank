import java.util.Scanner;

public class Ex6OperacoesTeste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo à calculadora de operações matemáticas. Por gentileza, informe a operação desejada (opções: + - / *)");
        String operador = entrada.nextLine();

        if (operador.equals("+") || operador.equals("*") || operador.equals("-") || operador.equals("/")) {
            System.out.println("Informe o primeiro número:");
            double numero1 = entrada.nextDouble();
            System.out.println("Informe o segundo número:");
            double numero2 = entrada.nextDouble();
            double resultado = 0;

            if (operador.equals("+")) {
                resultado = numero1 + numero2;
            } else if (operador.equals("-")) {
                resultado = numero1 - numero2;
            } else if (operador.equals("/")) {
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Não é permitida a divisão por 0");
                }
            } else if (operador.equals("*")) {
                resultado = numero1 * numero2;
            }
            System.out.println("O resultado é " + resultado);

        } else {
            System.out.println("Operação desconhecida");
        }

    }
}
