import java.io.IOException;
import java.util.Scanner;

public class Set {

    private static final int[][] TRIOS_VALIDOS = {
            {0, 0, 0}, {1, 1, 1}, {2, 2, 2},
            {3, 3, 3}, {4, 4, 4}, {5, 5, 5},
            {6, 6, 6}, {7, 7, 7}, {8, 8, 8},

            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {0, 5, 7}, {1, 3, 8},
            {1, 5, 6}, {2, 3, 7}, {2, 4, 6}
    };

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) break;

            int[] contagem = new int[9];

            for (int i = 0; i < n; i++) {
                String numero = sc.next();
                String figura = sc.next();

                int numId = obterNumeroId(numero);
                int figId = obterFiguraId(limparPlural(figura));

                int cartaId = numId * 3 + figId;
                contagem[cartaId]++;
            }

            System.out.println(calcularMaxSets(contagem, 0));
        }
        sc.close();
    }

    private static String limparPlural(String f) {
        if (f.endsWith("s")) {
            return f.substring(0, f.length() - 1);
        }
        return f;
    }

    private static int obterNumeroId(String num) {
        if (num.equals("um")) return 0;
        if (num.equals("dois")) return 1;
        return 2; // "tres"
    }

    private static int obterFiguraId(String fig) {
        if (fig.equals("circulo")) return 0;
        if (fig.equals("quadrado")) return 1;
        return 2; // "triangulo"
    }

    private static int calcularMaxSets(int[] contagem, int trioIndex) {
        if (trioIndex >= TRIOS_VALIDOS.length) {
            return 0;
        }

        int max = calcularMaxSets(contagem, trioIndex + 1);

        int c1 = TRIOS_VALIDOS[trioIndex][0];
        int c2 = TRIOS_VALIDOS[trioIndex][1];
        int c3 = TRIOS_VALIDOS[trioIndex][2];

        if (podeFormarTrio(contagem, c1, c2, c3)) {
            contagem[c1]--;
            contagem[c2]--;
            contagem[c3]--;

            int opcaoComTrio = 1 + calcularMaxSets(contagem, trioIndex);
            max = Math.max(max, opcaoComTrio);

            contagem[c1]++;
            contagem[c2]++;
            contagem[c3]++;
        }

        return max;
    }

    private static boolean podeFormarTrio(int[] contagem, int c1, int c2, int c3) {
        if (c1 == c2 && c2 == c3) {
            return contagem[c1] >= 3;
        }
        return contagem[c1] > 0 && contagem[c2] > 0 && contagem[c3] > 0;
    }
}
