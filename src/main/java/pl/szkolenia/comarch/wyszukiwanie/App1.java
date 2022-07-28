package pl.szkolenia.comarch.wyszukiwanie;

import java.util.Random;

public class App1 {
    public static void main(String[] args) {
        int[] tab = new int[700000000];

        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1000000000);
        }

        long startTime = System.currentTimeMillis();
        int min = tab[0];

        for(int element : tab) {
            if(element < min) {
                min = element;
                int a = (min / 1123) % 345;
                String b = a + "";
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Najmniejsza wartość: " + min);
        System.out.println("Czas: " + (endTime - startTime));
    }
}
