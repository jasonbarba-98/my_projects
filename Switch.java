import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        int poraRoku;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj cyfre od 1 do 4 : \n");
        poraRoku = scanner.nextInt();
        switch(poraRoku)
        {
            case 1:
                System.out.println("Wiosna");
                break;
            case 2:
                System.out.println("Lato");
                break;
            case 3:
                System.out.println("Jesień");
                break;
            case 4:
                System.out.println("Zima");
                break;
            default:
                System.out.println("Narazie nie ma innych pór");
        }

    }
}
