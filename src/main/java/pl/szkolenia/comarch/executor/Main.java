package pl.szkolenia.comarch.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /*ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());

        ExecutorService multiExecutor = Executors.newFixedThreadPool(4);

        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());*/

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        scheduledExecutorService.schedule(new Watek(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(), 10, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
