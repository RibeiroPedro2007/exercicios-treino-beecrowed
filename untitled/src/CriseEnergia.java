import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CriseEnergia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            int m = 1;
            while (true) {
                if (simularSorteio(n, m) == 13) {
                    System.out.println(m);
                    break;
                }
                m++;
            }
        }

        scanner.close();
    }

    /**
     * Simula a sequência de desligamentos para um dado N e m.
     * @return O número da última região a ser desligada.
     */
    private static int simularSorteio(int n, int m) {
        List<Integer> regioes = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            regioes.add(i);
        }

        int index = 0; // A primeira região a ser removida é sempre a 1 (índice 0)
        regioes.remove(index);

        while (regioes.size() > 1) {
            // Avança m - 1 passos a partir da posição atual
            index = (index + m - 1) % regioes.size();
            regioes.remove(index);
        }

        // Retorna a única região restante
        return regioes.get(0);
    }
}