import java.io.IOException;
import java.util.Scanner;

public class AumentoSalario {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        double n= sc.nextDouble();
        double n2=n;
        int p=0;
        if (n>=0&&n<=400){
            n2*=0.15;
            n=n+(n*0.15);
            p=15;
        }else if(n>400&&n<=800){
            n2*=0.12;
            n=n+(n*0.12);
            p=12;
        }else if(n>800&&n<=1200){
            n2*=0.10;
            n=n+(n*0.10);
            p=10;
        }else if(n>1200&&n<=2000){
            n2*=0.07;
            n=n+(n*0.07);
            p=7;
        }else if(n>2000){
            n2*=0.04;
            n=n+(n*0.04);
            p=4;
        }
        System.out.printf("Novo salario: %.2f\n", n);
        System.out.printf("Reajuste ganho: %.2f\n", n2);
        System.out.println("Em percentual: "+p+" %");


    }

}