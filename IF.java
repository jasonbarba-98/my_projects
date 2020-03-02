public class IF {
    public static void main(String[] args){
        int wiek =12;
        if(wiek >=18)
        {
            System.out.println("Osoba pełnoletnia");
        }
        else if(wiek>=16)
        {
            System.out.println("masz ponad 16 lat możesz już wiele zrobić");
        }
        else
        {
            System.out.println("Nie możesz nic :(");
        }
// trójargumentowy warunek
        String imie = wiek >= 18 ? "Aneta" : "Anetka";
                System.out.println(imie);
    }
}
