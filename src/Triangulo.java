import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");

        int numero = scanner.nextInt();

        for (int i = numero; i > 0; i--) {
            for (int j = 1; j <= i; j++){
                System.out.printf("*");
        }
        System.out.printf("\n");
        }
    }
}
