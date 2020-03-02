public class tablice {
    public static void main(String[] args){
        String[] tab = new String[20];
        tab[0] = "Ania";
        tab[1] = "Anetka";
        tab[2] = "Adam";
        for(int i=0;i<tab.length;i++)
        {
            System.out.println(tab[i]);
        }
        // inne sposoby inicjalizacji tablicy
        int[] tab1 = {0,2,5,6,10};
        int[] tab2 = new int[5];
        tab2[0] = 2;
        int year = 1,wynik;
        wynik = year/10;
        System.out.println(wynik);


    }

    boolean checkPalindrome(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        StringBuilder reverse = stringBuilder.reverse();
        String reversString = reverse.toString();
        return inputString.equals(reversString);
    }
}
