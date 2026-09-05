import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Animal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String p1 = br.readLine().trim();
        String p2 = br.readLine().trim();
        String p3 = br.readLine().trim();

        if (p1.equals("vertebrado")) {
            if (p2.equals("ave")) {
                if (p3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (p3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (p2.equals("mamifero")) {
                if (p3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (p3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (p1.equals("invertebrado")) {
            if (p2.equals("inseto")) {
                if (p3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (p3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (p2.equals("anelideo")) {
                if (p3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (p3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
