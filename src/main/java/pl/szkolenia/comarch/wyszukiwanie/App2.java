package pl.szkolenia.comarch.wyszukiwanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App2 {

    public final static List<Integer> mins = new ArrayList<>();

    public static void main(String[] args) {
        int[] tab = new int[700000000];

        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1000000000);
        }

        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(new MinFinder(tab, 0, 100000000));
        Thread t2 = new Thread(new MinFinder(tab, 100000000, 200000000));
        Thread t3 = new Thread(new MinFinder(tab, 200000000, 300000000));
        Thread t4 = new Thread(new MinFinder(tab, 300000000, 400000000));
        Thread t5 = new Thread(new MinFinder(tab, 400000000, 500000000));
        Thread t6 = new Thread(new MinFinder(tab, 500000000, 600000000));
        Thread t7 = new Thread(new MinFinder(tab, 600000000, 700000000));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int min = App2.mins.stream().min(Integer::compareTo).get();
        long endTime = System.currentTimeMillis();

        System.out.println("Najmniejsza wartość: " + min);
        System.out.println("Czas: " + (endTime - startTime));
    }
}
