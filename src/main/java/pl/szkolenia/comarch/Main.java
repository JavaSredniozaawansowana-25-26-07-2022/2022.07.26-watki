package pl.szkolenia.comarch;

public class Main {
    public static void main(String[] args) {
        /*Watek w1 = new Watek(1);
        Watek w2 = new Watek(2);
        Watek w3 = new Watek(3);
        Watek w4 = new Watek(4);
        Watek w5 = new Watek(5);

        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w5.start();*/

        Thread t1 = new Thread(new LepszyWatek());

        t1.start();


        System.out.println("Wszystkie wątki wystartowane !!");
    }
}
