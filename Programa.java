import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Digite a temperatura " + i + ": ");
            double temperatura = scan.nextDouble();

            while (temperatura < 4 || temperatura > 10) {
                System.out.println("Temperatura inválida. Digite novamente.");
                System.out.print("Digite a temperatura " + i + ": ");
                temperatura = scan.nextDouble();
            }

            soma += temperatura;
            contador++;
        }

        double media = soma / contador;
        System.out.println("A média das temperaturas é: " + media);

        scan.close();
    }
}
