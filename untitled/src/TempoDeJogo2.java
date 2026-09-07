import java.io.IOException;
import java.util.Scanner;

public class TempoDeJogo2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int minInicio = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minFinal = sc.nextInt();

        int inicioEmMinutos = horaInicio * 60 + minInicio;
        int fimEmMinutos = horaFinal * 60 + minFinal;

        int duracaoEmMinutos = fimEmMinutos - inicioEmMinutos;

        if (duracaoEmMinutos <= 0) {
            duracaoEmMinutos += 24 * 60; // Soma 1440 minutos (24 horas)
        }

        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        sc.close();
    }
}