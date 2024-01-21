public class Operacoes {

    public static void main(String[] args){

        int x = 14;
        int y = 5;

        int soma = x + y;
        int subtracao = x - y;
        int multiplicacao = x * y;
        double divisao = (double) x / y;

        System.out.println("Soma: " + soma); // System.out.println("Soma: " + (x+y) );
        System.out.println("Subtração: " + subtracao); // System.out.println("Soma: " + (x-y) );
        System.out.println("Soma: " + multiplicacao); // System.out.println("Soma: " + (x*y) );
        System.out.println("Soma: " + divisao); // System.out.println("Soma: " + (x/y) );

        int maiorInteiro = Integer.MAX_VALUE;
        long menorInteiro = Long.MAX_VALUE;
        System.out.println("Maior inteiro: " + maiorInteiro);
        System.out.println("Maior inteiro: " + menorInteiro);

    }
}
