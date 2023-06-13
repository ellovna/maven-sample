package com.solvd.laba.concurrency;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.*;

public class ThreadMain {
    private static final Logger LOGGER = LogManager.getLogger(ThreadMain.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //System.out.println("Custom thread (runnable) message: " + Thread.currentThread().getId());
                LOGGER.info("Custom thread (runnable) message: " + Thread.currentThread().getId());
            }
        };
        Thread thread1 = new Thread(runnable);

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //System.out.println("Custom thread (thread) message: " + Thread.currentThread().getId());
            LOGGER.info("Custom thread (thread) message: " + Thread.currentThread().getId());
        });

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "Callable is finished";
            }
        };

        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(thread1);
        executorService.submit(thread2);

        Future <String> future = executorService.submit(callable);
        if(!future.isDone()){
            //System.out.println("Callable is not finished yet");
            LOGGER.info("Callable is not finished yet");
        }
        //System.out.println(future.get());
        //System.out.println("Callable is executed on service");
        LOGGER.info("Callable is executed on service");

        executorService.shutdown();

        //executorService.execute(thread1);
        //executorService.execute(thread2);

        //System.out.println("Main thread message: " + Thread.currentThread().getId());
        LOGGER.info("Main thread message: " + Thread.currentThread().getId());

        //while(!future.isDone()) System.out.println("Callable is not finished yet");
    }
}
