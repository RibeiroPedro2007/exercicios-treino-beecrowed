import java.io.IOException;
import java.util.Scanner;


public class SeisNumerosImpares {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < 6; i++) {
            if (n%2!=0){
                System.out.println(n);
                n+=2;
            }else{
                n+=1;
                System.out.println(n);
                n+=1;
            }
        }
    }

}