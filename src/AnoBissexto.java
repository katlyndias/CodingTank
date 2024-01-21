import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um ano: ");
        int ano = scanner.nextInt();

        boolean divisivelPor4 = ano % 4 == 0;
        boolean naoDivisivelPor100 = ano % 100 != 0;
        boolean divisivelPor400 = ano % 400 == 0;
        boolean ehBissexto = (divisivelPor4 && naoDivisivelPor100) || divisivelPor400;

        if (ehBissexto){
            System.out.println("Ano bissexto!");
        } else {
            System.out.println("Ano não é bissexto.");
        }
    }
}
