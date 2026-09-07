import java.io.IOException;
import java.util.Scanner;

public class Prefacio {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int q = a / b;
        int r = a % b;

        // Se o resto for negativo, fazemos o ajuste euclidiano
        if (r < 0) {
            int absB = Math.abs(b);
            r += absB;
            q = (a - r) / b;
        }

        System.out.println(q + " " + r);

        sc.close();
    }
}