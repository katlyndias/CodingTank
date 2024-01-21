import java.math.BigDecimal;

public class Saudacao {

    public static void main(String[] args) {
        String nome = "Katlyn";
        int x = 10;
        double y = 10.5;
        boolean condicao = true;
        BigDecimal numeroGrande = new BigDecimal("100000000000000000000000000000000000000");

        System.out.println("Numero = " + numeroGrande);
        System.out.println("Numero = " + x);
        System.out.println("Ponto flutuante = " + y);
        System.out.println("Condicional = " + condicao);
        System.out.println("Boa noite, " + nome.toUpperCase());
        System.out.println("Até logo, ".concat(nome));
    }
}
