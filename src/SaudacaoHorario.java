import java.util.Scanner;

public class SaudacaoHorario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Informe um horário (em horas apenas)");
        int horas = scanner.nextInt();
        boolean ehDia = horas >= 4 && horas <= 11;
        boolean ehTarde = horas >= 12 && horas <= 17;
        boolean ehNoite = (horas >= 18 && horas <= 23);
        boolean ehMadrugada = (horas >= 0 && horas <= 3);

        if (ehDia){
            System.out.printf("Bom dia, %s", nome);
        } else if (ehTarde){
            System.out.printf("Boa tarde, %s", nome);
        } else if (ehNoite || ehMadrugada){
            System.out.printf("Boa noite, %s", nome);
        } else {
            System.out.println("Horário inválido.");
        }

    }



}
