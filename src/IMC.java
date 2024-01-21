import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine(); // considera tudo até dar um enter no teclado
        System.out.println("Boa noite, " + nome);

        System.out.println("Qual a sua altura em metros?");
        double altura = entrada.nextDouble();

        System.out.println("Qual o seu peso em kg");
        double peso = entrada.nextDouble();

        double IMC = peso/(altura * altura);
        double alturaAoQuadrado = Math.pow(altura,2);
        double IMC2 = peso/(alturaAoQuadrado);
        System.out.printf("O valor do seu IMC é %.2f.\n", IMC);
        System.out.printf("O valor do seu IMC é %.2f.\n", IMC2);
    }
}
