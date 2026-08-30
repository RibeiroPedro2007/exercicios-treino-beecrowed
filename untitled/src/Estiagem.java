import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Estiagem {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        int cidade = 0;

        while ((line = reader.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            if (!st.hasMoreTokens()) continue;

            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;

            int[] consumoAgrupado = new int[201];

            long totalMoradores = 0;
            long totalConsumo = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(reader.readLine());
                int moradores = Integer.parseInt(st.nextToken());
                int consumoTotalImovel = Integer.parseInt(st.nextToken());

                totalMoradores += moradores;
                totalConsumo += consumoTotalImovel;

                int consumoMedioPessoa = consumoTotalImovel / moradores;

                consumoAgrupado[consumoMedioPessoa] += moradores;
            }

            cidade++;

            if (cidade > 1) {
                System.out.println();
            }

            System.out.println("Cidade# " + cidade + ":");

            boolean primeiro = true;
            StringBuilder sb = new StringBuilder();

            for (int c = 0; c <= 200; c++) {
                if (consumoAgrupado[c] > 0) {
                    if (!primeiro) {
                        sb.append(" ");
                    }
                    sb.append(consumoAgrupado[c]).append("-").append(c);
                    primeiro = false;
                }
            }
            System.out.println(sb.toString());

            double media = (double) totalConsumo / totalMoradores;

            long mediaTruncada = (long) (media * 100);
            double resultadoFinal = (double) mediaTruncada / 100;

            System.out.printf("Consumo medio: %.2f m3.\n", resultadoFinal);
        }
    }
}