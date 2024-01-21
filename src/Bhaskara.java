import java.util.Scanner;
//refazer com o novo enunciado

public class Bhaskara {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Bem vindo(a) à calculadora de Equações do Segundo Grau. \n \nPor gentileza, informe o coeficiente a:\n");
        double a = entrada.nextDouble();
        System.out.println("Agora informe o coeficiente b:");
        double b = entrada.nextDouble();
        System.out.println("Por fim, informe o coeficiente c:");
        double c = entrada.nextDouble();

        double bAoQuadrado = Math.pow(b,2);
        double delta = bAoQuadrado - (4*a*c);

            double raizQuadrada = Math.sqrt(delta);
            double x1 = (-b + raizQuadrada)/(2*a);
            double x2 = (-b - raizQuadrada)/(2*a);

        System.out.printf("O delta é igual a %.0f.\n", delta);
        System.out.printf("X1 é igual a %.0f.\n", x1);
        System.out.printf("X2 é igual a %.0f.\n", x2);

    }
}
