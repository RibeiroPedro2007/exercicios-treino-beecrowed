import java.io.IOException;
import java.util.Scanner;


public class Media3 {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        double n1= sc.nextDouble();
        double n2= sc.nextDouble();
        double n3= sc.nextDouble();
        double n4= sc.nextDouble();
        double cont=0;

        cont+=n1*0.2;
        cont+=n2*0.3;
        cont+=n3*0.4;
        cont+=n4*0.1;

        System.out.printf("Media: %.1f\n",cont);
        if (cont>=7.0){

            System.out.println("Aluno aprovado.");

        }else if(cont>= 5.0&& cont<=6.9){

            System.out.println("Aluno em exame.");
            double n5= sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n",n5);
            cont=(cont+n5)/2.0;
            if(cont>=5.0){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n",cont);

        }else{

            System.out.println("Aluno reprovado.");
        }

    }

}