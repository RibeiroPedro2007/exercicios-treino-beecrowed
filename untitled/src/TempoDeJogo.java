import java.io.IOException;
import java.util.Scanner;

public class TempoDeJogo  {

    public static void main(String[] args) throws IOException {
            Scanner sc= new Scanner(System.in);
            int horaInicio= sc.nextInt();
            int horaFinal= sc.nextInt();
            int horas=0;
            if (horaInicio==horaFinal){
                horas=24;
            }
            while(horaInicio!=horaFinal){
                horas++;
                if(horaInicio==23){
                    horaInicio=0;
                    horas++;
                }
                horaInicio++;
            }
            System.out.println("O JOGO DUROU "+horas+" HORA(S)");

    }

}
