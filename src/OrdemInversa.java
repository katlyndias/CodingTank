import java.util.Scanner;

public class OrdemInversa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas palavras serão informadas?");
        int numPalavras = scanner.nextInt();
        scanner.nextLine();
        String[] palavras = new String[numPalavras];
        String respostas = "";
        for (int i = 0; i < numPalavras; i++){
            System.out.println("Informe a palavra" + (i+1));
            palavras[i] = scanner.nextLine();
            respostas += palavras[i] + ",";

        }


        System.out.println("Palavras informadas: " + respostas);
        System.out.println("Ordem inversa ");
        for (int i = numPalavras - 1; i > -1; i--){
            System.out.println(palavras[i] + ",");
        }



    }

}
