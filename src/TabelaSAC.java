import java.util.Scanner;

public class TabelaSAC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Olá, por gentileza, informe o valor do empréstimo: ");
        double valorEmprestimo = entrada.nextDouble();

        // verifica se o valor é positivo
        if (valorEmprestimo < 0.0) {
            System.out.print("Por gentileza, informe um valor positivo de empréstimo.");
        } else {

            System.out.print("Informe a taxa de juros (em %) do empréstimo: ");
            double taxaJuros = (entrada.nextDouble() / 100.0);

            // verifica se valor é positivo
            if (taxaJuros < 0.0) {
                System.out.print("Por gentileza, informe um valor positivo de taxa de juros.");
            } else {
                System.out.print("Informe o tempo (número de meses) para pagamento: ");
                int numMeses = entrada.nextInt();
                // verifica se valor é positivo
                if (numMeses < 0.0) {
                    System.out.print("Por gentileza, informe um valor positivo de meses.");
                } else {

                    double amortizacao = valorEmprestimo / numMeses;

                    double saldoDevedor = valorEmprestimo;

                    double totalPago = 0;
                    double totalAmortizado = 0;
                    double totalJuros = 0;
                    double taxaJuros2 = taxaJuros * 100;

//                    System.out.println("Valor fixo da amortização R$ " + amortizacao);
                    System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com um juros de %.1f%% ao mês \n", amortizacao, valorEmprestimo,taxaJuros2);


                    for (int i = 1; i <= numMeses; i++) {

                        double juros = saldoDevedor * taxaJuros;

                        double prestacao = juros + amortizacao;

                        saldoDevedor -= amortizacao;

                        totalPago += prestacao;
                        totalAmortizado += amortizacao;
                        totalJuros += juros;

//                        System.out.println("Parcela " + i + " | Juros: R$ " + juros + " | Prestação: R$ " + prestacao + " | Saldo devedor: R$ " + saldoDevedor);
                        System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f\n", i, juros, prestacao, saldoDevedor);

                    }

//                    System.out.println("Total: Prestação R$ " + totalPago + ", Juros R$ " + totalJuros + ", Amortização R$ " + totalAmortizado);
                    System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f\n", totalPago, totalJuros, totalAmortizado);

                }
            }
        }
    }
}