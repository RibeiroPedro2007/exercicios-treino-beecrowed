import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        List<Integer> originais = new ArrayList<>();
        originais.add(sc.nextInt());
        originais.add(sc.nextInt());
        originais.add(sc.nextInt());

        List<Integer> ordenados = new ArrayList<>(originais);
        Collections.sort(ordenados);


        ordenados.forEach(System.out::println);

        System.out.println();

        originais.forEach(System.out::println);

        sc.close();
    }
}