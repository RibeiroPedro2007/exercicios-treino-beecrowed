import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimoJosephus {
    private static final List<Integer> PRIMOS = gerarPrimos(3501);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) break;

            List<Integer> pessoas = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                pessoas.add(i);
            }

            int indiceAtual = 0;
            int rodada = 0;


            while (pessoas.size() > 1) {
                int passoPrimo = PRIMOS.get(rodada);

                indiceAtual = (indiceAtual + passoPrimo - 1) % pessoas.size();

                pessoas.remove(indiceAtual);

                rodada++;
            }

            System.out.println(pessoas.get(0));
        }
        sc.close();
    }
    private static List<Integer> gerarPrimos(int quantidade) {
        List<Integer> lista = new ArrayList<>();
        int numero = 2;
        while (lista.size() < quantidade) {
            if (ehPrimo(numero)) {
                lista.add(numero);
            }
            numero++;
        }
        return lista;
    }

    private static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}