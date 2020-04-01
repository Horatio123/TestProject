package com.baimahu.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) {

        ExecutorService service = Executors.newScheduledThreadPool(3);
        List<Future<Integer>> allFuture = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = service.submit(new FutureJob());
            allFuture.add(future);
        }

        for (Future<Integer> future: allFuture) {
            try {
                System.out.println(future.get(1, TimeUnit.SECONDS));
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                e.printStackTrace();
            }

            service.shutdown();

            //System.out.println(future.cancel(false));
            //System.out.println(future.isCancelled());
            //System.out.println(future.isDone());
        }

    }
}
class FutureJob implements Callable<Integer> {
    @Override
    public Integer call() {
        return new Random().nextInt();
    }
}