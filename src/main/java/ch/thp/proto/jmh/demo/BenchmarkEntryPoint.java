
package ch.thp.proto.jmh.demo;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;



/**
 *
 * @author caleb
 */
public class BenchmarkEntryPoint {
    public static void main(String[] args) throws Exception{
        Options opt = new OptionsBuilder()
                .include(ArrayListVsLinkedList.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();
        
        new Runner(opt).run();
    }
}
