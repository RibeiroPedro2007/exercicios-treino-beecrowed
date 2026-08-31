import java.io.IOException;
import java.util.Scanner;

public class LendaFlavio {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int nc = sc.nextInt();

            for (int i = 1; i <= nc; i++) {
                int n = sc.nextInt(); // Quantidade de pessoas
                int k = sc.nextInt(); // Tamanho do salto

                int sobrevivente = 0; // Para 1 pessoa, o índice em base 0 é 0

                // Calcula a posição do sobrevivente de 2 até n pessoas
                for (int p = 2; p <= n; p++) {
                    sobrevivente = (sobrevivente + k) % p;
                }

                // Soma +1 no final porque as posições do problema começam em 1
                System.out.println("Case " + i + ": " + (sobrevivente + 1));
            }
        }

        sc.close();
    }
}