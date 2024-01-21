import java.util.Scanner;

public class Q3teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um número inteiro
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        // Desenhar triângulo com o topo para cima
        System.out.println("Triângulo com o topo para cima:");
        for (int i = numero; i >= 1; i -= 2) {
            // Espaços iniciais
            for (int j = 0; j < (numero - i) / 2; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Nova linha
            System.out.println();
        }

        // Pular duas linhas
        System.out.println("\n\n");

        // Desenhar triângulo com o topo para baixo
        System.out.println("Triângulo com o topo para baixo:");
        for (int i = 1; i <= numero; i += 2) {
            // Espaços iniciais
            for (int j = 0; j < (numero - i) / 2; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Nova linha
            System.out.println();
        }

        scanner.close();
    }
}