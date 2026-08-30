import java.io.IOException;
import java.util.Scanner;


public class Criptografia {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int cont = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cont; i++) {
            String frase= sc.nextLine();
            char[] letras= frase.toCharArray();
            char[] letrasInvertidas= new char[letras.length];

            //step 1
            for (int x = 0; x < letras.length; x++) {
                if (Character.isLetter(letras[x])){
                    letras[x] = (char) (letras[x] + 3);
                }
            }//joga as letras tres casas pra cima

            //step 2
            int aux= 0;
            for(int y= letrasInvertidas.length-1; y>=0; y--){
                letrasInvertidas[aux]=letras[y];
                aux++;
            }// inverte a char

            //step 3
            int metade= letrasInvertidas.length/2;
            for(int z=metade; z< letrasInvertidas.length; z++){
                letrasInvertidas[z] = (char) (letrasInvertidas[z]-1);
            }//faz o bagulho lá truncado

            System.out.println(new String(letrasInvertidas));


        }


    }

}