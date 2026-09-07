import java.io.IOException;
import java.util.Scanner;

public class MaiorAndPosicao {

    public static void main(String[] args) throws IOException {

        Scanner sc= new Scanner(System.in);
        int maior=0;
        int posicao=0;

        for (int i=1; i<=100; i++){
            int n= sc.nextInt();
            if (n>maior){
                maior=n;
                posicao=i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);


    }

}
