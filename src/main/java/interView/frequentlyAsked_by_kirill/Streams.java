package interView.frequentlyAsked_by_kirill;

import interView.frequentlyAsked_by_kirill.testClasses.Worker;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    @Test
    public void streamDemo(){
        List<Integer> values = List.of(1,1,2,3,4, 4,5,6,6);

        //for each is a terminal operator that has consumer as a parameter Represents an operation that accepts a single input argument and returns no result.
        // Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
        //values.stream().distinct().forEach(System.out::print);
        System.out.println("one");
        values.stream().distinct().forEach(smth -> System.out.print(" "+smth) );
        System.out.println("");

        System.out.println("two");
        List l = values.stream().distinct().map(a->a*2).collect(Collectors.toList());
        System.out.println(l);
        System.out.println("");

        System.out.println("three");
        Integer a = values.stream().max(Integer::compareTo).get();
        System.out.println("max is: "+a);
        System.out.println("");

        //primitive streams
        System.out.println(IntStream.range(1,10).sum());
        List ll = IntStream.rangeClosed(1,10).filter(i->i%2!=0).boxed().collect(Collectors.toList());
        System.out.println("primitive: "+ll);

        //groupingBy
        Worker w1 = new Worker("John", 20, 2001, "dev");
        Worker w2 = new Worker("Andrew", 30, 2100, "Ing");
        Worker w3 = new Worker("Vova", 24, 2020, "dev");
        Worker w4 = new Worker("Alex", 50, 20220, "med");
        Worker w5 = new Worker("Mich", 55, 20, "dev");
        Worker w6 = new Worker("Rawshan", 19, 0, "dev");
        Worker w7 = new Worker("Oleg", 4, 20110, "med");
        Worker w8 = new Worker("Helga", 200, 2010, "girl");
        List workers = List.of(w1,w2,w3,w4,w5,w6,w7,w8 );
        Map<String, List<Worker>> map1 = (Map<String, List<Worker>>) workers.stream().collect(Collectors.groupingBy(Worker::getPosition));
        System.out.println(map1);
    }
}
