import java.util.Scanner;

public class DesenhoTriangulos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Obtém o número inteiro do usuário
        System.out.print("Olá! Por gentileza, digite um número inteiro: ");
        int numero = entrada.nextInt();

        // Desenhar o primeiro triangulo/pirâmide

        for (int i = 1; i <= numero; i += 2) {
            int espacos = (numero - i) / 2;
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Com a segunda pirâmide abaixo da primeira:
        System.out.printf("\n");
        for (int i = 1; i <= numero; i += 2) {
            int espacos = (numero - i) / 2;
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = numero; i >= 1; i -= 2) {
            int espacos = (numero - i) / 2;
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}