import java.io.IOException;
import java.util.Scanner;


public class Impares {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for (int i=1; i <=n; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }


    }

}