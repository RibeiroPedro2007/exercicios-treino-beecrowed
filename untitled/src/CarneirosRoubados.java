import java.io.IOException;
import java.util.Scanner;

public class CarneirosRoubados {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        int[] carneiros = new int[n];
        boolean[] atacados = new boolean[n];

        long totalCarneiros = 0;

        for (int i = 0; i < n; i++) {
            carneiros[i] = sc.nextInt();
            totalCarneiros += carneiros[i];
        }

        int i = 0;
        while (i >= 0 && i < n) {

            atacados[i] = true;

            int carneirosAtuais = carneiros[i];


            if (carneiros[i] > 0) {
                carneiros[i]--;
                totalCarneiros--;
            }

            if (carneirosAtuais % 2 != 0) {
                i++;
            } else {
                i--;
            }
        }

        int totalSitiosAtacados = 0;
        for (int j = 0; j < n; j++) {
            if (atacados[j]) {
                totalSitiosAtacados++;
            }
        }

        System.out.println(totalSitiosAtacados + " " + totalCarneiros);

        sc.close();
    }
}