package l22_multithreading.threads_and_executors_7.simple_example_1;

/**
 * Created by VSulevskiy on 08.05.2015.
 */
public class SimpleExampleTask implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Hello " + threadName);
    }
}
