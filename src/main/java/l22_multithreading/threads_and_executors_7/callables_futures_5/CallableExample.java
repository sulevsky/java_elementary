package l22_multithreading.threads_and_executors_7.callables_futures_5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by VSulevskiy on 08.05.2015.
 */
public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<Integer> future = executor.submit(new CallableExampleTask());
        System.out.println("is future done? " + future.isDone());
        Integer result = future.get();
//        Integer result = future.get(1,TimeUnit.SECONDS);
        System.out.println("is future done? " + future.isDone());
        System.out.println("result: " + result);
    }
}
