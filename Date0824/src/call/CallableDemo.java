package call;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Integer> submit = pool.submit(new MyCallable(100));
        Future<Integer> submit1 = pool.submit(new MyCallable(101));
        Integer integer = submit.get();
        Integer integer1 = submit1.get();
        System.out.println(integer);
        System.out.println(integer1);
        pool.shutdown();
    }
}
