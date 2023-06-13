package com.solvd.laba.concurrency;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CompletableFutureMain {
    private static final Logger LOGGER = LogManager.getLogger(CompletableFuture.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "supplier is done " + Thread.currentThread().getName();
    }, executorService);

        completableFuture.thenRun(() -> {
            //System.out.println("Runnable is executed " + Thread.currentThread().getName());
            LOGGER.info("Runnable is executed " + Thread.currentThread().getName());

        });

        executorService.shutdown();

        //System.out.println(completableFuture.get());
        LOGGER.info(completableFuture.get());
    }
}
