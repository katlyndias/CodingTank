import java.util.Scanner;

public class SequenciaNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor inicial.");
        int valorInicial = Integer.parseInt(scanner.nextLine());
        System.out.println("Informe o valor final.");
        int valorFinal = Integer.parseInt(scanner.nextLine());

        for(int i=valorInicial; i <= valorFinal; i++){
            System.out.println(i);
        }
    }
}
