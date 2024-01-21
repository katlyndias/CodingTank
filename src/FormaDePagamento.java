//import java.util.Scanner;
//
//public class FormaDePagamento {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Qual o valor da compra?");
//        double vlCompra = scanner.nextDouble();
//        System.out.println("Qual a forma de pagamento? [CREDITO, DEBITO, CHEQUE, BOLETO, DINHEIRO, PIX]");
//        scanner.nextLine();
//        String formaPgto = scanner.nextLine();
//        switch (formaPgto.toUpperCase()) {
//            case "CREDITO":
//            case "DEBITO":
//                double desconto = vlCompra * 0.03;
//                double vlDescontado = vlCompra - desconto;
//                System.out.println("A sua compra possui 3% de desconto.");
//                System.out.printf("Totalizando R$ %f", vlDescontado);
//                break;
//            case "CHEQUE":
//                double desconto = vlCompra * 0.06;
//                double vlDescontado = vlCompra - desconto;
//                System.out.println("A sua compra possui 6% de desconto.");
//                System.out.printf("Totalizando R$ %f", vlDescontado);
//                break;
//            case "BOLETO":
//                double desconto = vlCompra * 0.09;
//                double vlDescontado = vlCompra - desconto;
//                System.out.println("A sua compra possui 9% de desconto.");
//                System.out.printf("Totalizando R$ %f", vlDescontado);
//                break;
//            case "DINHEIRO":
//            case "PIX":
//
//                double desconto = vlCompra * 0.12;
//                double vlDescontado = vlCompra - desconto;
//                System.out.println("A sua compra possui 12% de desconto.");
//                System.out.printf("Totalizando R$ %f", vlDescontado);
//            default:
//                System.out.println("Forma de pagamento inválida");
//        }

        // CTRL + BARRA PRA COLOCAR COMENTARIO EM VARIAS LINHAS E TIRAR
//        String formaPgto = formaPgto.toUpperCase();
//        String formaMinuscula = formaPgto.toLowerCase();
//        if ((formaPgto.equalsIgnoreCase("CREDITO") || (formaPgto.equalsIgnoreCase("DEBITO")){
//            double desconto = vlCompra * 0.03;
//            double vlDescontado = vlCompra - desconto;
//            System.out.println("A sua compra possui 3% de desconto.");
//            System.out.printf("Totalizando R$ %f", vlDescontado);
//        } else if {(formaPgto.equalsIgnoreCase("CHEQUE")){
//            double desconto = vlCompra * 0.06;
//            double vlDescontado = vlCompra - desconto;
//            System.out.println("A sua compra possui 6% de desconto.");
//            System.out.printf("Totalizando R$ %f", vlDescontado);
//
//        } else if {(formaPgto.equalsIgnoreCase("BOLETO")){
//            double desconto = vlCompra * 0.09;
//            double vlDescontado = vlCompra - desconto;
//            System.out.println("A sua compra possui 9% de desconto.");
//            System.out.printf("Totalizando R$ %f", vlDescontado);
//
//        } else if {((formaPgto.equalsIgnoreCase("DINHEIRO")||(formaPgto.equalsIgnoreCase("PIX")){
//            double desconto = vlCompra * 0.12;
//            double vlDescontado = vlCompra - desconto;
//            System.out.println("A sua compra possui 12% de desconto.");
//            System.out.printf("Totalizando R$ %f", vlDescontado);
//
//        }
//
//    }
//}
