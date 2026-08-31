import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Marmore {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int caso = 1;

        while (sc.hasNextInt()) {
            int numMarmores = sc.nextInt();
            int consultasMeena = sc.nextInt();

            if (numMarmores == 0 && consultasMeena == 0) {
                break;
            }

            int[] marmores = new int[numMarmores];
            for (int i = 0; i < numMarmores; i++) {
                marmores[i] = sc.nextInt();
            }Arrays.sort(marmores);

            System.out.println("CASE# " + caso + ":");
            for (int i = 0; i < consultasMeena; i++) {
                int consulta = sc.nextInt();

                int pos = Arrays.binarySearch(marmores, consulta);//Busca binária

                if (pos >= 0) {
                    while (pos > 0 && marmores[pos - 1] == consulta) {
                        pos--;
                    }
                    System.out.println(consulta + " found at " + (pos + 1));
                } else {
                    System.out.println(consulta + " not found");
                }
            }

            caso++;
        }
        sc.close();
    }
}