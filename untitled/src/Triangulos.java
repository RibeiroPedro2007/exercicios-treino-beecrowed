import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        double a = Math.max(x, Math.max(y, z));
        double c = Math.min(x, Math.min(y, z));
        double b = (x + y + z) - a - c;

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}