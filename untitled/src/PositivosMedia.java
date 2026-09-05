import java.io.IOException;
import java.util.Scanner;

public class PositivosMedia  {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int posi=0;
        double media=0;
        for (int i = 0; i < 6 ; i++) {
            double n= sc.nextDouble();
            if(n>0){
                posi++;
                media+=n;
            }
        }
        System.out.println(posi+" valores positivos");
        System.out.println(media/posi);
    }

}