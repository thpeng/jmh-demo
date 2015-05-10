/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.thp.proto.jmh.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;


public class ArrayListVsLinkedList {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void addOnArrayList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add("bla" + i);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void addOnLinkedList() {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add("bla" + i);
        }
    }
}
