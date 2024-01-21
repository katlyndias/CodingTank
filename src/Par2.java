import java.util.Scanner;

public class Par2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("args = ");

        System.out.println("Informe um numero");
        int num = scanner.nextInt();

        boolean ehPar = num % 2 == 0;
        if (ehPar){
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
    }
}
