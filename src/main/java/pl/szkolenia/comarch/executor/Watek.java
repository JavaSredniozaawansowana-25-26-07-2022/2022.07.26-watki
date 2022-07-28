package pl.szkolenia.comarch.executor;

public class Watek implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++)
            System.out.println(i);
    }
}
