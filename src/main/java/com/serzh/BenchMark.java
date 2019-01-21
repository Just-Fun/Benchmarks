package com.serzh;

//import org.openjdk.jmh.annotations.*;

import java.nio.charset.Charset;
import java.util.Arrays;

public class BenchMark {

   /* @State(Scope.Benchmark)
    public static class ExecutionPlan {

        //        @Param({ "100", "200", "300", "500", "1000" })
        @Param({"2", "3"})
        public int iterations;

        public SomeService service;

        @Setup(Level.Invocation)
        public void setUp() {
            System.out.println();
            System.out.println("!!!!!!!!:" + iterations);
            int[] array = new int[555_555];
//            Arrays.fill(array, 777);
            Arrays.fill(array, 7);
            service = new SomeService(array);
        }
    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
//    @BenchmarkMode(Mode.SingleShotTime)
    @Warmup(iterations = 2, time = 1) // 1 s each by default
    @Measurement(iterations = 3, time = 3*//*, timeUnit = TimeUnit.SECONDS*//*)
    public void bench(ExecutionPlan plan) {

       *//* for (int i = plan.iterations; i > 0; i--) {

            plan.service.doSomething();
        }*//*

//        ExceptionUtils.getStackTrace(e)  из apache.commons.lang3
    }*/

    /*@Benchmark
    @Fork(value = 1, warmups = 1)
    @BenchmarkMode(Mode.Throughput)
    public void init() {
        // Do nothing
    }*/

}
