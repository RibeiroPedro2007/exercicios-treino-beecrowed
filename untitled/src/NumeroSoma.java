import java.io.IOException;
import java.util.Scanner;

public class NumeroSoma {
        public static void main(String[] args) throws IOException {
            Scanner sc= new Scanner(System.in);
            int m= sc.nextInt();
            int n= sc.nextInt();

            while(m>0&&n>0){
                int maior;
                int menor;
                int cont=0;
                if (m>n){
                    maior=m;
                    menor=n;
                }else{
                    maior=n;
                    menor=m;
                }

                for (int i = menor; i <= maior; i++) {
                    cont+=i;
                    System.out.printf("%s ",i);
                }


                System.out.println("Sum="+cont);
            m= sc.nextInt();
            n= sc.nextInt();
            }
        }

    }