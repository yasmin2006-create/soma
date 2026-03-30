import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Digite números inteiros (0 para encerrar):");

        numero = sc.nextInt();

        while (numero != 0) {
            soma += numero; // soma o número digitado
            numero = sc.nextInt(); // lê o próximo número
        }

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}