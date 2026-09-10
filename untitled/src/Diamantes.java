import java.io.IOException;
import java.util.Scanner;

public class Diamantes {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String conteudo = sc.nextLine();
            int comeco = 0;
            int diamantes = 0;

            for (char c : conteudo.toCharArray()) {
                if (c == '<') {
                    comeco++;
                } else if (c == '>' && comeco > 0) {
                    diamantes++;
                    comeco--;
                }
            }

            System.out.println(diamantes);
        }

        sc.close();
    }
}