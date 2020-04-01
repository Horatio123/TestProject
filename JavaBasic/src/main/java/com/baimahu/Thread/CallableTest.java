package com.baimahu.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) {

        ExecutorService service = Executors.newScheduledThreadPool(3);
        List<Future> allFuture = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = service.submit(new FutureJob<>());
            allFuture.add(future);
        }

        for (Future future: allFuture) {
            try {
                System.out.println(future.get(1, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }

            //System.out.println(future.cancel(false));
            //System.out.println(future.isCancelled());
            //System.out.println(future.isDone());
        }

    }
}
class FutureJob<I extends Number> implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}