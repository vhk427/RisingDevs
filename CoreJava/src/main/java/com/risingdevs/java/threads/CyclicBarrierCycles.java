package com.risingdevs.java.threads;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierCycles {

    static CyclicBarrier barrier;

    public static void main(String[] args) throws InterruptedException {
        barrier = new CyclicBarrier(3); 

        new Worker().start();
        Thread.sleep(1000);
        System.out.println( barrier.getNumberWaiting());
        new Worker().start();
        Thread.sleep(1000);
        System.out.println( barrier.getNumberWaiting());
        new Worker().start();
        Thread.sleep(1000);
        System.out.println( barrier.getNumberWaiting());
        barrier.getNumberWaiting();
        System.out.println("Barrier automatically resets.");

        new Worker().start();
        Thread.sleep(1000);
        new Worker().start();
        Thread.sleep(1000);
        new Worker().start();
    }

}


class Worker extends Thread {
    @Override
    public void run() {
        try {
            CyclicBarrierCycles.barrier.await();
            System.out.println("Let's play.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}