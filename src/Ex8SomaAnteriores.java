//Faça um programa que pede para a usuária digitar um número inteiro positivo. Seu programa deverá responder a soma de do
//    número com todos os seus antecessores positivos.
//        Ex: se o número digitado for 5, a conta a ser realizada será 5 + 4 + 3 + 2 + 1, e o resultado na tela será "15".


import java.util.Scanner;

public class Ex8SomaAnteriores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = entrada.nextInt();

        // Verifica se o número é positivo
        if (numero < 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            int soma = 0;

            // Calcula a soma dos antecessores positivos
            for (int i = numero; i >= 1; i--) {
                soma += i;
            }

            System.out.println("A soma dos antecessores é: " + soma);
        }
    }
}
