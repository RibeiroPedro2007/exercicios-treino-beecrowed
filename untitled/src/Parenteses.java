import java.io.IOException;
import java.util.Scanner;

public class Parenteses {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String eq = sc.nextLine();
            int saldo = 0;
            boolean ok = true;

            for (char c : eq.toCharArray()) {
                if (c == '(') {
                    saldo++;
                } else if (c == ')') {
                    saldo--;
                    if (saldo < 0) {
                        ok = false;
                        break;
                    }
                }
            }

            if (ok && saldo == 0) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }

        sc.close();
    }
}