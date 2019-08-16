package com.serzh;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 2)
@Measurement(iterations = 3, time = 3, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.SECONDS)
//@Fork(value = 1)
@Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"}, warmups = 2)
@State(Scope.Thread)
//https://www.mkyong.com/java/java-jmh-benchmark-tutorial/
public class SomeServicePerfTest {
    //    @Param({"10"})
    @Param({"5555555"})
    public int times;
//    public int times = 5555555;

    private SomeService someService;

    @Setup
    public void setup() {
//        org.openjdk.jmh.util.Utils
        System.out.println();
        System.out.println("!!!!!!!!times: " + times);
//        int[] array = new int[555_555_5];
        int[] array = new int[times];
        Arrays.fill(array, 777);
        someService = new SomeService(array);
    }

    @Benchmark
    public void publisherPerformance() {
        someService.doSomething();
    }

    public static void main(String[] args) throws IOException, RunnerException {
        org.openjdk.jmh.Main.main(args);
    }
}
