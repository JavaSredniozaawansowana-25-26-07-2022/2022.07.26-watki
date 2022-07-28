package pl.szkolenia.comarch.wyszukiwanie;

public class MinFinder implements Runnable {

    private int[] tab;
    private int startIndex;
    private int endIndex;

    public MinFinder(int[] tab, int startIndex, int endIndex) {
        this.tab = tab;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        int min = this.tab[this.startIndex];
        for(int i = this.startIndex+1; i < this.endIndex; i++) {
            if(min > tab[i]) {
                min = tab[i];
                int a = (min / 1123) % 345;
                String b = a + "";
            }
        }
        App2.mins.add(min);
    }
}
