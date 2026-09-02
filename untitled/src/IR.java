import java.io.IOException;
import java.util.Scanner;

public class IR {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        double n= sc.nextDouble();
        if (n>=0&&n<=2000){
            System.out.println("Isento");
            return;
        }else if(n>2000&&n<=3000){
            n=(n-2000.00)*0.08;
        }else if(n>3000&&n<=4500){
            n=(1000.00 * 0.08) + ((n - 3000.00) * 0.18);
        }else if(n>4500){
            n=(1000.00 * 0.08) + (1500.00 * 0.18) + ((n - 4500.00) * 0.28);
        }
        System.out.printf("R$ %.2f\n", n);

    }

}