import java.util.Random;
import java.util.Scanner;

public class Easy_Game {
    public static void main(String[] args) {
        int moja, szukana, licznik = 0;
        Random rnd = new Random();
        szukana = rnd.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        do{
            licznik++;
            System.out.print("Podaj liczbę : \n");
            moja = scanner.nextInt();
            if (moja > szukana) {
                System.out.println("Trochę za duża");
            } else if (moja < szukana) {
                System.out.println("Trochę za mała");
            }
        }while(moja!=szukana);
        System.out.println("Bingoooooo próbowałeś :" + licznik + " razy");
    }
}
