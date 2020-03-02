import java.util.Scanner;

public class Hello_World {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Podaj imie : \n");
        name = scanner.nextLine();
        System.out.print("Hello " + name + "\n");
        System.out.print("How are you feeling ?\n");
        System.out.print("dodaje próbną linijke ?\n");
    }



}
