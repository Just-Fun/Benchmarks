package com.serzh;

public class SomeService {

    private final int[] array;

    public SomeService(int[] array) {
        this.array = array;
    }

    public void doSomething() {
        System.out.println("Start method.");
        int result = 0;
        try {
            System.out.println("sleep");
            Thread.sleep(700);
        } catch (InterruptedException e) {
            System.out.println();
            e.printStackTrace();
        }
        System.out.println("wake");
        for (int i : array) {
            result += i;
        }
        System.out.println("Result: " + result);
    }
}
