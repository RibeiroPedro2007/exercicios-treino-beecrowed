import java.io.IOException;
import java.util.Scanner;

public class Figurinha {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int cont = sc.nextInt();

            for (int i = 0; i < cont; i++) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();

                while (n2 != 0) {
                    int resto = n1 % n2;
                    n1 = n2;
                    n2 = resto;
                }
                System.out.println(n1);
            }
        }

        sc.close();
    }
}