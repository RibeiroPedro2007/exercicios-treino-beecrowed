import java.io.IOException;
import java.util.Scanner;

public class ParImpar{

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int c= sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n= sc.nextInt();
            if (n == 0) {
                System.out.println("NULL");
            }
            if (n < 0) {
                if (n % -2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
            if(n>0){
                if (n % -2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            }
        }
    }

}